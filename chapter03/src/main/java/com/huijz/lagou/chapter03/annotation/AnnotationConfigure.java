package com.huijz.lagou.chapter03.annotation;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/11/29 下午11:11
 */
@Configuration
@EnableConfigurationProperties(AnnotationProperties.class)
public class AnnotationConfigure {
    @Bean
    public AnnotationClient annotationClient(AnnotationProperties annotationProperties) {
        return new AnnotationClient(annotationProperties);
    }
}
