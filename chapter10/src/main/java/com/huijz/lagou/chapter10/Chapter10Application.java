package com.huijz.lagou.chapter10;

import com.netflix.hystrix.strategy.HystrixPlugins;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class Chapter10Application {

    public static void main(String[] args) {
        //HystrixPlugins.getInstance().registerPropertiesStrategy(new CustomHystrixPropertiesStrategy());
        SpringApplication.run(Chapter10Application.class, args);
    }

}
