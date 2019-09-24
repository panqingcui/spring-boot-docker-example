package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.User;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * 功能描述,该部分必须以中文句号结尾。
 *
 * @author panqingcui
 * @create 2019-09-21 17:21
 */
@RestController
public class TestController {
    private final static Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/json")
    public User fastJson() {
        return new User("this is fastjson");
    }

    @RequestMapping("/")
    public void test() throws InterruptedException, ExecutionException, TimeoutException {
        LOGGER.info("进入----");
        test1();
    }

    public void test1() throws InterruptedException, ExecutionException, TimeoutException {
        // 阻塞调用
        sayHello("yan");
        // 限时调用
        sayHelloFutrue("yan").get(1, TimeUnit.SECONDS);
    }

    @Async
    public void sayHello(String name) throws InterruptedException {
        Thread.sleep(10000);
        LoggerFactory.getLogger(TestController.class).info(name + ":Hello World!");
    }

    @Async
    public ListenableFuture<String> sayHelloFutrue(String name) {
        String res = name + ":Hello World!";
        LoggerFactory.getLogger(TestController.class).info(res);
        return new AsyncResult<>(res);
    }
}
