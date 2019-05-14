package com.sumsoon.zzz.po;

import java.io.Serializable;

public class XXX implements Serializable {
    private String maa;

    private String sadf;

    private String wrsa;

    private String sfds;

    private static final long serialVersionUID = 1L;

    public XXX() {
    }

    public XXX(String maa, String sadf, String wrsa, String sfds) {
        this.maa = maa;
        this.sadf = sadf;
        this.wrsa = wrsa;
        this.sfds = sfds;
    }

    public String getMaa() {
        return maa;
    }

    public void setMaa(String maa) {
        this.maa = maa == null ? null : maa.trim();
    }

    public String getSadf() {
        return sadf;
    }

    public void setSadf(String sadf) {
        this.sadf = sadf == null ? null : sadf.trim();
    }

    public String getWrsa() {
        return wrsa;
    }

    public void setWrsa(String wrsa) {
        this.wrsa = wrsa == null ? null : wrsa.trim();
    }

    public String getSfds() {
        return sfds;
    }

    public void setSfds(String sfds) {
        this.sfds = sfds == null ? null : sfds.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", maa=").append(maa);
        sb.append(", sadf=").append(sadf);
        sb.append(", wrsa=").append(wrsa);
        sb.append(", sfds=").append(sfds);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
//
//    @Override
//    public String toString() {
//        return "XXX{" +
//                "maa='" + maa + '\'' +
//                ", sadf='" + sadf + '\'' +
//                ", wrsa='" + wrsa + '\'' +
//                ", sfds='" + sfds + '\'' +
//                '}';
//    }



}