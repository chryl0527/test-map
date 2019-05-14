package com.sumsoon.controller;

/**
 * Created By Chr on 2019/5/14.
 */
public class XXObj {

    public String status;
    public Object data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "XXObj{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
