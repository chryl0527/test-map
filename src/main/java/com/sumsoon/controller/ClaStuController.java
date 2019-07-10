package com.sumsoon.controller;

import com.sumsoon.zzz.mapper.ClaStuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试resultMap:一对一,一对多,多对多,多对多对一
 * <p>
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
    public Object show2() {
        return claStuMapper.queryClazStuFromMap();
    }

    @RequestMapping("/stu3")
    public Object show3() {
        return claStuMapper.queryOrdersAndOrderDetailAndItems();
    }

    @RequestMapping("/stu4")
    public Object show4() {
        return claStuMapper.queryCompStaffs();
    }

    @RequestMapping("/stu5")
    public Object show5() {
        return claStuMapper.queryCPCC();
    }

}
