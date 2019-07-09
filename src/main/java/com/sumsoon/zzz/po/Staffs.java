package com.sumsoon.zzz.po;

import java.io.Serializable;

/**
 * Created By Chr on 2019/7/9.
 */
public class Staffs implements Serializable {
    private static final long serialVersionUID = 6551068497165799054L;

    private Integer staffId;
    private String staffName;
    private Integer companyId;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}
