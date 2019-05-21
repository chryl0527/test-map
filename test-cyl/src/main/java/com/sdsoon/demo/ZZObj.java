package com.sdsoon.demo;

/**
 * Created By Chr on 2019/5/14.
 */
public class ZZObj {
    public Object data;
    public String status;


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ZZObj{" +
                "data=" + data +
                ", status='" + status + '\'' +
                '}';
    }

}
