package com.sdsoon.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created By Chr on 2019/5/14.
 */

@RequestMapping("/he")
@RestController
public class Controller {


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/i")
    public void show() {
        //1
        ResponseEntity<String> forEntity
                = restTemplate.getForEntity("http://localhost:8099/te/st12", String.class);

        Object body = forEntity.getBody();
        System.out.println(body);

        JSONObject jsonObject = JSON.parseObject(body.toString());
        ZZObj zzObj = new ZZObj();

        zzObj.setData(jsonObject.get("data"));
        zzObj.setStatus(jsonObject.getString("status"));
        System.out.println(zzObj);
        System.out.println(jsonObject);




        //==================asd
        //2
        ResponseEntity<ZZObj> forEntity2 =
                restTemplate.getForEntity("http://localhost:8099/te/st12", ZZObj.class);

        ZZObj body2 = forEntity2.getBody();
        System.err.println(body2);
    }
}
