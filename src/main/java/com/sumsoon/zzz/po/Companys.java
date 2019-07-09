package com.sumsoon.zzz.po;

import java.io.Serializable;
import java.util.List;

/**
 * Created By Chr on 2019/7/9.
 */
public class Companys implements Serializable {
    private static final long serialVersionUID = -1803257165152957784L;

    private Integer id;
    private String companyName;
    private List<Staffs> staffsList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Staffs> getStaffsList() {
        return staffsList;
    }

    public void setStaffsList(List<Staffs> staffsList) {
        this.staffsList = staffsList;
    }
}
