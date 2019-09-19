package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.GitService;

import java.util.Map;

@SpringBootApplication

public class DemoApplication {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        // SpringApplication.run(DemoApplication.class, args);
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
        Map<String, GitService> beans = applicationContext.getBeansOfType(GitService.class);
        System.out.println("------------------------------");
        beans.forEach((name, son) -> {
            System.out.println("------------------------------");
            System.out.println("当前类是 : " + name);
            System.out.println("son.say() = " + son.git());
            System.out.println("getBean = " + applicationContext.getBean(son.getClass()).toString());
            System.out.println("getBean = " + applicationContext.getBean(son.getClass()).toString());
        });
    }


}
