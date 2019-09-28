package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>功能描述,该部分必须以中文句号结尾 .</p>
 * <p>
 * 创建日期 2019/9/10
 *
 * @author panqingcui
 * @since 1.0.0
 */
@Controller
public class DemoController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        System.out.println("--------------------------->>>>>>**************");
        return "this is docker spring boot";
    }
}
