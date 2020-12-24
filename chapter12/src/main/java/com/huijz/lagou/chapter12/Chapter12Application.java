package com.huijz.lagou.chapter12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Chapter12Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter12Application.class, args);
    }

}
