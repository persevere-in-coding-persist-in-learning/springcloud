package com.huijz.lagou.chapter01.controller;

import com.huijz.lagou.chapter01.config.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/11/22 下午4:54
 * @desc spring boot 配置文件读取的不同方法
 */
@RestController
public class ConfigController {

    @Value("${server.port:8080}")
    private String port;

    @Resource
    private Environment env;

    @Resource
    private User user;


    @GetMapping("getConfig")
    public Object getConfig() {
        Map<String, Object> configs = new HashMap<>(10);
        configs.put("profile", env.getProperty("spring.profiles.active"));
        configs.put("port", port);
        configs.put("user", user.toString());
        return configs;
    }


}
