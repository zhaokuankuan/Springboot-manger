package com.kk.Springbootmanger.domain;

import java.io.Serializable;
/**
 * 订单信息
 * Created  by Mr.kk
 * DateTime on 2018-08-23 10:36:51
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

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
    private String addtime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

}