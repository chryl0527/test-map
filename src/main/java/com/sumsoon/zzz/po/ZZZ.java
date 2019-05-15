package com.sumsoon.zzz.po;

import java.io.Serializable;
import java.util.Date;

public class ZZZ implements Serializable {
    private String qwe;

    private Date timsta;

    private Integer asd;

    private Date zxc;

    private Date st;

    private Double fgh;

    private Date en;

    public ZZZ() {
    }

    public ZZZ(String qwe, Date timsta, Integer asd, Date zxc, Date st, Double fgh, Date en) {
        this.qwe = qwe;
        this.timsta = timsta;
        this.asd = asd;
        this.zxc = zxc;
        this.st = st;
        this.fgh = fgh;
        this.en = en;
    }

    private static final long serialVersionUID = 1L;

    public String getQwe() {
        return qwe;
    }

    public void setQwe(String qwe) {
        this.qwe = qwe == null ? null : qwe.trim();
    }

    public Date getTimsta() {
        return timsta;
    }

    public void setTimsta(Date timsta) {
        this.timsta = timsta;
    }

    public Integer getAsd() {
        return asd;
    }

    public void setAsd(Integer asd) {
        this.asd = asd;
    }

    public Date getZxc() {
        return zxc;
    }

    public void setZxc(Date zxc) {
        this.zxc = zxc;
    }

    public Date getSt() {
        return st;
    }

    public void setSt(Date st) {
        this.st = st;
    }

    public Double getFgh() {
        return fgh;
    }

    public void setFgh(Double fgh) {
        this.fgh = fgh;
    }

    public Date getEn() {
        return en;
    }

    public void setEn(Date en) {
        this.en = en;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qwe=").append(qwe);
        sb.append(", timsta=").append(timsta);
        sb.append(", asd=").append(asd);
        sb.append(", zxc=").append(zxc);
        sb.append(", st=").append(st);
        sb.append(", fgh=").append(fgh);
        sb.append(", en=").append(en);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}