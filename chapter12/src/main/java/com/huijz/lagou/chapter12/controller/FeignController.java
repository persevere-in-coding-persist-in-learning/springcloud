package com.huijz.lagou.chapter12.controller;

import com.huijz.lagou.chapter12.client.UserRemoteClient;
import com.huijz.lagou.chapter12.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/8 下午8:43
 */
@RestController
public class FeignController {

    @Resource
    UserRemoteClient userRemoteClient;

    @GetMapping("get")
    public Object get() {
        System.out.println(Thread.currentThread().getName());
        User user = userRemoteClient.getUser(1);
        return user;
    }


}
