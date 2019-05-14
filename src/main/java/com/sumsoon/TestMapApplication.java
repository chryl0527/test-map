package com.sumsoon;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(scanBasePackages = {"com.sumsoon"})
@MapperScan("com.sumsoon.zzz.mapper")
public class TestMapApplication {

    public static void main(String[] args) {

        SpringApplication.run(TestMapApplication.class, args);

        log.debug("日志测试 log debug");

        log.info("=========================");

        log.error("日志测试 log error");

    }

}
