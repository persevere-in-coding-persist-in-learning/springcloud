package com.huijz.lagou.chapter09.config;

import com.huijz.lagou.chapter09.rule.MyRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/7 下午11:23
 */
public class MyRuleConfiguration {
    @Bean
    public IRule myRule() {
        return new MyRule();
    }
}
