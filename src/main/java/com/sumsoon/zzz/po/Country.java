package com.sumsoon.zzz.po;

import java.io.Serializable;
import java.util.List;

/**
 * Created By Chr on 2019/7/10.
 */
public class Country implements Serializable {
    private static final long serialVersionUID = -6661758582945454474L;
    private Integer id;
    private String countryName;
    //
    private List<Province> provinceList;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<Province> getProvinceList() {
        return provinceList;
    }

    public void setProvinceList(List<Province> provinceList) {
        this.provinceList = provinceList;
    }
}
