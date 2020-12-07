package com.huijz.lagou.chapter09.controller;

import com.huijz.lagou.chapter09.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/5 下午10:00
 */
@RestController
public class RibbonController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("get")
    public Object get() {
        //@LoadBalanced 如果restTemplate创建的时候加了注解，则直接可以用服务名称进行远程调用
        User user = restTemplate.getForEntity("http://eureka-client-provider/user/get?id=1", User.class).getBody();
        //User user = restTemplate.getForEntity("http://localhost:8007/user/get?id=1", User.class).getBody();
        return user;
    }

}
