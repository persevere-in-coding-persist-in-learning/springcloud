package com.huijz.lagou.chapter07.controller;

import com.huijz.lagou.chapter07.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/6 上午8:28
 */
@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping("get")
    public User get(Integer id) {
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        User user = new User(id, "springCloud");
        return user;

    }
}
