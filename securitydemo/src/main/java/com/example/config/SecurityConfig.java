package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

/**
 * 功能描述,该部分必须以中文句号结尾。
 *
 * @author panqingcui
 * @create 2019-09-24 22:04
 */
//@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
            .withUser("user").password("{noop}password").roles("ADMIN");
    }
}
