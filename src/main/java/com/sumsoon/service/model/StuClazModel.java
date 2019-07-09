package com.sumsoon.service.model;

import com.sumsoon.zzz.po.Student;

import java.io.Serializable;

/**
 * Created By Chr on 2019/7/9.
 */
public class StuClazModel extends Student implements Serializable {

    private static final long serialVersionUID = -4991773607218111731L;
    private Integer clazzId;

    private String clazzName;

    public Integer getClazzId() {
        return clazzId;
    }

    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }
}
