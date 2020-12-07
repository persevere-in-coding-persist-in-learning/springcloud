package com.huijz.lagou.chapter09.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/5 下午9:39
 */
@Configuration
public class RestConfiguration {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
