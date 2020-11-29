package com.huijz.lagou.chapter01.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/11/22 下午5:31
 * @desc 通过配置文件中的前缀。获取配置文件中的属性
 */

@Configuration
@ConfigurationProperties(prefix = "spring")
public class User implements Serializable {
    /**
     * 用户名称
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
