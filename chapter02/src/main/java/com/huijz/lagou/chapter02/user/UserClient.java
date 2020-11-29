package com.huijz.lagou.chapter02.user;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/11/29 上午8:33
 */
public class UserClient {
    private UserProperties userProperties;

    public UserClient(UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    public String getName() {
        return this.userProperties.getName();
    }

}
