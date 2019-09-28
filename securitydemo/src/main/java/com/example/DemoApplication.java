package com.example;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能描述,该部分必须以中文句号结尾。
 *
 * @author panqingcui
 * @create 2019-09-24 21:29
 */
@SpringBootApplication
public class DemoApplication implements ExitCodeGenerator {

    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(DemoApplication.class, args)));
        ;
    }

    @Override public int getExitCode() {
        return 24;
    }
}
