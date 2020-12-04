package com.huijz.lagou.chapter07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Chapter07Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter07Application.class, args);
    }

}
