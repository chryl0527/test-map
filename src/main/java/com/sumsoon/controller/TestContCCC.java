package com.sumsoon.controller;

import com.sumsoon.zzz.mapper.CCCMapper;
import com.sumsoon.zzz.po.CCC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试useGeneratedKeys
 * <p>
 * Created By Chr on 2019/7/2.
 */
@RestController
@RequestMapping(value = "/c")
public class TestContCCC {
    @Autowired
    private CCCMapper cccMapper;

    @RequestMapping("/ccc")
    public void show() {
        CCC ccc = new CCC();
        ccc.setTestName("ccc" + Math.random());
        int i = cccMapper.insertUseGeneratedKeys(ccc);
        System.out.println(i);
    }
}
