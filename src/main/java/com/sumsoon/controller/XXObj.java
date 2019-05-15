package com.sumsoon.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By Chr on 2019/5/14.
 */
public class XXObj {

    public String status;
    public Object data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "XXObj{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }


    //面试题
    public static void main(String args[]) {

        Integer i = 100;
        Integer j = 100;
        System.out.println(i == j); //true

        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b); //false


        int n=1;
        System.out.println(n++);
        int y=1;
        System.out.println(++y);


        Map map=new HashMap();
        map.put(n,y);
        System.out.println(map.get(n));

    }
}
