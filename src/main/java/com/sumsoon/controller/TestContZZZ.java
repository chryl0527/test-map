package com.sumsoon.controller;

import com.sumsoon.zzz.mapper.ZZZOthMapper;
import com.sumsoon.zzz.po.ZZZ;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 测试时间区间查找
 * <p>
 * Created By Chr on 2019/5/15.
 */
@Slf4j
@RestController
@RequestMapping(value = "/de")
public class TestContZZZ {


    @Autowired
    private ZZZOthMapper zzzOthMapper;

    @RequestMapping(value = "/mo")
    public Object show() {

//        List<ZZZ> zzzes = zzzOthMapper.query01(new Date(70, 01, 03, 12, 00, 00), new Date(70, 07, 03, 12, 00, 00));
//        List<ZZZ> zzzes = zzzOthMapper.query01(new Date(70, 01, 03, 12, 00, 00), null);
        List<ZZZ> zzzes = zzzOthMapper.query01(null, new Date(70, 07, 03, 12, 00, 00));
//        List<ZZZ> zzzes = zzzOthMapper.query01(null, null);

        return zzzes;
    }

    public static void main(String args[]) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Date date = new Date(70, 02, 03, 12, 00, 00);

        System.out.println(simpleDateFormat.format(date));
    }
}
