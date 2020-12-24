package com.huijz.lagou.chapter12.client;

import com.huijz.lagou.chapter12.dto.User;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/9 下午9:49
 */
public class UserRemoteClientFallback implements UserRemoteClient {
    @Override
    public User getUser(Integer id) {
        return new User(0, "默认用户");
    }
}
