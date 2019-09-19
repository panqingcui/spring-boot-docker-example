package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>功能描述,该部分必须以中文句号结尾 .</p>
 * <p>
 * 创建日期 2019/9/17
 *
 * @author panqingcui
 * @since 1.0.0
 */
@RestController
public class DemoRestController {
    @RequestMapping(value = "/rest_controller",method = RequestMethod.GET)
    //@ResponseBody
    public String index(){
        System.out.println("--------------------------->>>>>>**************");
        return "index";
    }
}
