package com.y;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 博客应用程序
 *
 * @author Y
 * @date 2023/02/25
 */
@SpringBootApplication
@MapperScan("com.y.dao")
public class YiaoBangBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(YiaoBangBlogApplication.class,args);
    }
}
