package com.huijz.lagou.chapter09.dto;

import java.io.Serializable;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/6 上午8:17
 */
public class User implements Serializable {
    /**
     * 用户id
     */
    private Integer id;
    /**
     * 用户名称
     */
    private String userName;

    public User() {
    }

    public User(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
