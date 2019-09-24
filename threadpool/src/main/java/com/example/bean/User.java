package com.example.bean;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * 功能描述,该部分必须以中文句号结尾。
 *
 * @author panqingcui
 * @create 2019-09-22 16:37
 */
@Data
public class User {
    @JSONField(name = "user_name")
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }
}
