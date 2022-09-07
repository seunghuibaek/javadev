package com.example.demo.Application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.debo")
public class BlogBoardApplication {
    public static void main(String[] args) {
        //SpringApplication.run();
    }
}
