package com.huijz.lagou.chapter07.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/4 下午10:51
 */
@Component
public class CustomerHealthIndicator extends AbstractHealthIndicator {
    private boolean status = true;

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        if (status) {
            builder.up();
        } else {
            builder.down();
        }
    }
}
