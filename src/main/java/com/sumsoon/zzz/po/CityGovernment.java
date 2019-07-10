package com.sumsoon.zzz.po;

import java.io.Serializable;

/**
 * Created By Chr on 2019/7/10.
 */
public class CityGovernment implements Serializable {
    private static final long serialVersionUID = -1948722500874463829L;
    private Integer id;
    private String cityGovernmentName;
    private Integer cityId;

    //


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityGovernmentName() {
        return cityGovernmentName;
    }

    public void setCityGovernmentName(String cityGovernmentName) {
        this.cityGovernmentName = cityGovernmentName;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
}
