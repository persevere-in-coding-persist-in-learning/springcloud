package com.huijz.lagou.chapter04.actuator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/2 上午7:15
 */
public class CustomHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up().withDetail("customInfo", "自定义信息");
    }
}
