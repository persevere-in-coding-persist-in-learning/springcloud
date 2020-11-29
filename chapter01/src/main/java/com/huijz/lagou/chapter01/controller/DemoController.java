package com.huijz.lagou.chapter01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/11/22 下午4:54
 * @desc: spring boot learn first demo
 */
@RestController
public class DemoController {

    @GetMapping("hello")
    public String helloWord(){
        return "hello spring boot!";
    }
}
