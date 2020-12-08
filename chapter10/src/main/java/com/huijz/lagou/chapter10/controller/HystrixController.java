package com.huijz.lagou.chapter10.controller;

import com.huijz.lagou.chapter10.dto.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/8 下午8:43
 */
@RestController
public class HystrixController {

    @Resource
    RestTemplate restTemplate;

    @HystrixCommand(commandKey = "getUser", groupKey = "user", fallbackMethod = "fallback", threadPoolKey = "tpk1",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
            }
    )
    @GetMapping("get")
    public Object get() {
        System.out.println(Thread.currentThread().getName());
        User user = restTemplate.getForEntity("http://eureka-client-provider/user/get?id=1", User.class).getBody();
        return user;
    }

    public Object fallback() {
        return new User(100, "默认");
    }
}
