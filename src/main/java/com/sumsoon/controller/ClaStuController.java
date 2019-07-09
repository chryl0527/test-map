package com.sumsoon.controller;

import com.sumsoon.zzz.mapper.ClaStuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Chr on 2019/7/9.
 */
@RestController
@RequestMapping("/cla")
public class ClaStuController {

    @Autowired
    private ClaStuMapper claStuMapper;

    @RequestMapping("/stu1")
    public Object show1() {
        return claStuMapper.queryClazStu();
    }

    @RequestMapping("/stu2")
    public Object sho2() {
        return claStuMapper.queryClazStuFromMap();
    }

    @RequestMapping("/stu3")
    public Object sho3() {
        return claStuMapper.queryOrdersAndOrderDetailAndItems();
    }

    @RequestMapping("/stu4")
    public Object sho4() {
        return claStuMapper.queryCompStaffs();
    }
}
