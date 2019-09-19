package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.GitService;

/**
 * <p>功能描述,该部分必须以中文句号结尾 .</p>
 * <p>
 * 创建日期 2019/9/19
 *
 * @author panqingcui
 * @since 1.0.0
 */
@Service
public class GitServiceImpl implements GitService {
    @Override public String git() {
        return "githup";
    }
}
