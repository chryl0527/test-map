package com.sumsoon.zzz.po;


import java.io.Serializable;

/**
 * Created By Chr on 2019/7/9.
 */
public class Orders implements Serializable {
    private static final long serialVersionUID = 699744914516286579L;
    private Integer orderId;
    private Integer userId;
    //维护user对象,是的user信息查询出来放到Orders信息返回
    private User user;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
