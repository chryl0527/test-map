package com.sumsoon.zzz.po;

import java.io.Serializable;

/**
 * Created By Chr on 2019/7/10.
 */
public class City implements Serializable {

    private static final long serialVersionUID = -225028485813554233L;
    private Integer id;
    private String cityName;
    private Integer provinceId;
    //
    private CityGovernment cityGovernment;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public CityGovernment getCityGovernment() {
        return cityGovernment;
    }

    public void setCityGovernment(CityGovernment cityGovernment) {
        this.cityGovernment = cityGovernment;
    }
}
