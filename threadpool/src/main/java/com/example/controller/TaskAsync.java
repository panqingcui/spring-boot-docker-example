package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * 功能描述,该部分必须以中文句号结尾。
 *
 * @author panqingcui
 * @create 2019-09-21 18:19
 */
@Service
@Async
public class TaskAsync {
    private static final Logger logger = LoggerFactory.getLogger(TaskAsync.class);
    public static Random random = new Random();

    public void one() throws Exception {
        logger.info("one  ");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        logger.info("finish one time  {}", end - start);
    }

    public void two() throws Exception {
        logger.info("two  ");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        logger.info("finish two time  {}", end - start);
    }


    public void three() throws Exception {
        logger.info("three  ");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        logger.info("finish three time  {}", end - start);
    }

    public void four() throws Exception {
        logger.info("four  ");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        logger.info("finish four time  {}", end - start);
    }

}
