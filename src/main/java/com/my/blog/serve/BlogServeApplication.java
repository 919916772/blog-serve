package com.my.blog.serve;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan({"com.my.blog.serve.*.mapper"})
@SpringBootApplication
public class BlogServeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogServeApplication.class, args);
    }

}
