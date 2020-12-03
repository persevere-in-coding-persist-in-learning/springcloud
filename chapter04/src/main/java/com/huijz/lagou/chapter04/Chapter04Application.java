package com.huijz.lagou.chapter04;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter04Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Chapter04Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("回掉函数");
    }
}
