package com.sumsoon.zzz.po;

import java.io.Serializable;

/**
 * Created By Chr on 2019/5/15.
 */
public class Oth implements Serializable {
    private static final long serialVersionUID = 1863952457052441710L;
    private String maaTest;

    private String sadfTest;

    private String wrsaTest;

    private String sfdsTest;

    public Oth() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMaaTest() {
        return maaTest;
    }

    public void setMaaTest(String maaTest) {
        this.maaTest = maaTest;
    }

    public String getSadfTest() {
        return sadfTest;
    }

    public void setSadfTest(String sadfTest) {
        this.sadfTest = sadfTest;
    }

    public String getWrsaTest() {
        return wrsaTest;
    }

    public void setWrsaTest(String wrsaTest) {
        this.wrsaTest = wrsaTest;
    }

    public String getSfdsTest() {
        return sfdsTest;
    }

    public void setSfdsTest(String sfdsTest) {
        this.sfdsTest = sfdsTest;
    }

    public Oth(String maaTest, String sadfTest, String wrsaTest, String sfdsTest) {

        this.maaTest = maaTest;
        this.sadfTest = sadfTest;
        this.wrsaTest = wrsaTest;
        this.sfdsTest = sfdsTest;
    }

    @Override
    public String toString() {
        return "Oth{" +
                "maaTest='" + maaTest + '\'' +
                ", sadfTest='" + sadfTest + '\'' +
                ", wrsaTest='" + wrsaTest + '\'' +
                ", sfdsTest='" + sfdsTest + '\'' +
                '}';
    }
}
