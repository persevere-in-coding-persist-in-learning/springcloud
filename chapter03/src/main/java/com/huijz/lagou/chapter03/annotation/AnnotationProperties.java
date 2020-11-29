package com.huijz.lagou.chapter03.annotation;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/11/29 下午11:05
 */
@ConfigurationProperties("spring.annotation")
public class AnnotationProperties {
    private String config;
    private Boolean enable;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}
