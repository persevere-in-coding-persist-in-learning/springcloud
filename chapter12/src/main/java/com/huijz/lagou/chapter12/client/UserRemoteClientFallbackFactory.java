package com.huijz.lagou.chapter12.client;

import com.huijz.lagou.chapter12.dto.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 发生异常时进行回退操作
 *
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/9 下午9:32
 */
@Component
public class UserRemoteClientFallbackFactory implements FallbackFactory<UserRemoteClient> {
    private Logger logger = LoggerFactory.getLogger(UserRemoteClientFallbackFactory.class);

    @Override
    public UserRemoteClient create(Throwable throwable) {
        return new UserRemoteClient() {
            @Override
            public User getUser(Integer id) {
                logger.error("UserRemoteClient.getUser异常！", throwable);
                return new User(0, "默认");
            }
        };
    }
}
