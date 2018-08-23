package com.kk.Springbootmanger.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *  用户信息
 *
 *  Created by xuxueli on '2018-08-16 15:33:05'.
 */
public class Userinfo implements Serializable {
    private static final long serialVersionUID = 42L;

    /**
     * 用户ID
     */
    private int userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 创建时间
     */
    private Date addtime;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

}
