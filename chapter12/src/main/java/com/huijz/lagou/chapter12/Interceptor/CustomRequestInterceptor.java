package com.huijz.lagou.chapter12.Interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/9 下午10:05
 */
@Component
public class CustomRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        System.out.println("requestTemplate = " + requestTemplate);
        requestTemplate.header("myHeader", "huijz.com");
    }
}
