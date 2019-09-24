package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * 功能描述,该部分必须以中文句号结尾。
 *
 * @author panqingcui
 * @create 2019-09-24 21:29
 */
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
