package com.sumsoon.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created By Chr on 2019/5/14.
 * <p>
 * list  []
 * map   {}
 */
public class Test {
    public static void show() {
        String jsontext =
                "{\"name\":\"wjk\",\"age\":\"22\",\"love\":[{\"love1\":\"coding\",\"love2\":\"movie\"},{\"love1\":\"money\",\"love2\":\"NBA\"}]}";

        //定义json文本
        System.err.println(jsontext);

        JSONObject m1 = new JSONObject();
        m1 = JSON.parseObject(jsontext);
        //将json文本转化为jsonobject
        System.err.println(m1);


        String jsonarraytext = m1.getString("love");
        System.err.println(jsonarraytext);


        JSONArray m2 = new JSONArray();
        m2 = JSON.parseArray(jsonarraytext);
        System.err.println(m2);

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        show();
        System.err.println("===============");
        show10();
    }

    public static void show10() {
        Map<String, Object> map = new HashMap<>();
        map.put("maa", "12");
        map.put("3", "12");
        map.put("ma4a", "12");
        map.put("ma2a", "12");
        map.put("m1aa", "12");
        map.put("m5aa", "12");
        map.put("m6aa", "12");
        map.put("m8aa", "12");


        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("12");
        list.add("14");
        list.add("15");
        list.add("61");
        list.add("17");
        list.add("81");
        list.add("109");
        list.add("10");

        //System.out.println(map.toString());
        String s1 = JSON.toJSONString(map, false);
        System.err.println(s1);


        JSONObject jsonObject = JSON.parseObject(s1);
        System.err.println(jsonObject);

        Object ma2a = jsonObject.get("ma2a");
        System.err.println(ma2a);
    }
}
