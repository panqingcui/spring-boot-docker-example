package com.example.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 功能描述,该部分必须以中文句号结尾。
 *
 * @author panqingcui
 * @create 2019-09-21 18:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskAsyncTest {
    @Autowired
    TaskAsync taskAsync;
    @Test
    public void test() throws Exception {
        taskAsync.one();
        taskAsync.two();
        taskAsync.three();
        taskAsync.four();
        Thread.sleep(100000);
    }
}
