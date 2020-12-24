package com.huijz.lagou.chapter12.config;

import com.huijz.lagou.chapter12.Interceptor.CustomRequestInterceptor;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/5 下午9:39
 */
@Configuration
public class FeignConfiguration {
    @Bean
    public Logger.Level getLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("user", "password");
    }

    @Bean
    public CustomRequestInterceptor customRequestInterceptor() {
        return new CustomRequestInterceptor();
    }

}
