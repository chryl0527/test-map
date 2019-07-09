package com.sumsoon.zzz.po;

import java.io.Serializable;

/**
 * Created By Chr on 2019/7/9.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 5120549507000166076L;
    private Integer id;
    private String userName;

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
