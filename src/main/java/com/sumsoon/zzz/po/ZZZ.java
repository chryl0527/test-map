package com.sumsoon.zzz.po;

import java.io.Serializable;
import java.util.Date;

public class ZZZ implements Serializable {
    private String qwe;

    private Integer asd;

    private Date zxc;

    private Date rty;

    private Double fgh;

    private static final long serialVersionUID = 1L;

    public ZZZ() {
    }

    public ZZZ(String qwe, Integer asd, Date zxc, Date rty, Double fgh) {
        this.qwe = qwe;
        this.asd = asd;
        this.zxc = zxc;
        this.rty = rty;
        this.fgh = fgh;
    }

    public String getQwe() {
        return qwe;
    }

    public void setQwe(String qwe) {
        this.qwe = qwe == null ? null : qwe.trim();
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

    public Date getRty() {
        return rty;
    }

    public void setRty(Date rty) {
        this.rty = rty;
    }

    public Double getFgh() {
        return fgh;
    }

    public void setFgh(Double fgh) {
        this.fgh = fgh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qwe=").append(qwe);
        sb.append(", asd=").append(asd);
        sb.append(", zxc=").append(zxc);
        sb.append(", rty=").append(rty);
        sb.append(", fgh=").append(fgh);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}