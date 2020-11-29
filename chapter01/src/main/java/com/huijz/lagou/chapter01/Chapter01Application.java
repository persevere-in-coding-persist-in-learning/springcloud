package com.huijz.lagou.chapter01;

import com.huijz.lagou.chapter03.annotation.EnableAutoConfigureAnnotationClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfigureAnnotationClient
@SpringBootApplication
public class Chapter01Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter01Application.class, args);
    }

}
