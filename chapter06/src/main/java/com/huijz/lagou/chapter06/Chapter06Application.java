package com.huijz.lagou.chapter06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Chapter06Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter06Application.class, args);
    }

}
