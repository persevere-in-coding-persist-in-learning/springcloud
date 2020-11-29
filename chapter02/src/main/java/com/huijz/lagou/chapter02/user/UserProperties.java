package com.huijz.lagou.chapter02.user;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/11/29 上午8:26
 */
@ConfigurationProperties("spring.user")
public class UserProperties {
    private String name;
    private Boolean enable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}
