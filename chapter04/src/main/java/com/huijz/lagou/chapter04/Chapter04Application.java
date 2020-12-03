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
        /**
         * 很多时候，我们需要在程序启动后，回调一些方法来处理某些事情，比如初始化本地缓存。
         * 这种场景我们可以使用 CommandLineRunner 和 ApplicationRunner 两个监听接口来实现。
         * */
        System.out.println("回掉函数");
    }
}
