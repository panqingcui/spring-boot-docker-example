package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述,该部分必须以中文句号结尾。
 *
 * @author panqingcui
 * @create 2019-09-24 22:23
 */
@RestController
public class RootController {
    @GetMapping(value = "/")
    public String hello(){
        return "<h1>Hello World</h1>";
    }
}
