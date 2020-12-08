package com.huijz.lagou.chapter11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class Chapter11Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter11Application.class, args);
    }

}
