package com.huijz.lagou.chapter01.controller;

import com.huijz.lagou.chapter03.annotation.AnnotationClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/11/29 下午11:19
 */
@RestController
public class AnnotationController {

    @Autowired
    AnnotationClient annotationClient;


    @GetMapping("annotation")
    public String getAnnotation() {
        return annotationClient.getConfig();
    }


}
