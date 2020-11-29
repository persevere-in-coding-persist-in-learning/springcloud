package com.huijz.lagou.chapter01.controller;

import com.huijz.lagou.chapter02.user.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/11/29 上午9:36
 */
@RestController
public class UserController {
    @Autowired
    UserClient userClient;

    @GetMapping("userName")
    public String getUserName() {
        return userClient.getName();
    }
}
