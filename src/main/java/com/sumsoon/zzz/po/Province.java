package com.sumsoon.zzz.po;

import java.io.Serializable;
import java.util.List;

/**
 * Created By Chr on 2019/7/10.
 */
public class Province implements Serializable {
    private static final long serialVersionUID = -7184901500409093499L;
    private Integer id;
    private Integer countryId;
    private String provinceName;
    //
    private List<City> cityList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }
}
