package com.sumsoon;

import com.sumsoon.zzz.mapper.ClaStuMapper;
import com.sumsoon.zzz.po.Country;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMapApplicationTests {
    @Autowired
    private ClaStuMapper claStuMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void contextLoads() {
        List<Country> countries = claStuMapper.queryCPCC();
        System.out.println(countries);
    }

    @Test
    public void show1() {
        String url = "http://127.0.0.1:8099/sb/queryAll";
        ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
        System.out.println(forEntity);
    }

}
