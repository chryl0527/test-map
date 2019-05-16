package com.sumsoon.controller;

import com.sumsoon.controller.vo.ZzzVo;
import com.sumsoon.zzz.mapper.OthZzzMapper;
import com.sumsoon.zzz.mapper.ZZZMapper;
import com.sumsoon.zzz.po.ZZZ;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
    private OthZzzMapper zzzOthMapper;
    @Autowired
    private ZZZMapper zzzMapper;

    @RequestMapping(value = "/mo")
    public Object show() {

//        List<ZZZ> zzzes = zzzOthMapper.query01(new Date(70, 01, 03, 12, 00, 00), new Date(70, 07, 03, 12, 00, 00));
        List<ZZZ> zzzes = zzzOthMapper.query01(new Date(70, 01, 03, 12, 00, 00), null);
//        List<ZZZ> zzzes = zzzOthMapper.query01(null, new Date(70, 07, 03, 12, 00, 00));
//        List<ZZZ> zzzes = zzzOthMapper.query01(null, null);

       /* zzzMapper.insertSelective(new ZZZ("21213"
                ,new Date(99,2,3,12,23,33)
                ,12
                ,new Date(99,2,3,12,23,33)
                ,new Date(99,2,3,12,23,33)
                , 22D,
                new Date(99,2,3,12,23,33)
        ));*/

        List<ZzzVo> collect = zzzes.stream().map(zzz -> {
            ZzzVo zzzVo = convertZzzVoFromZZZ(zzz);
            return zzzVo;
        }).collect(Collectors.toList());

        return collect;
    }

    private ZzzVo convertZzzVoFromZZZ(ZZZ zzz) {

        if (zzz == null) {
            return null;
        }
        ZzzVo zzzVo = new ZzzVo();

        BeanUtils.copyProperties(zzz, zzzVo);

        zzzVo.setSt(convertDate(zzz.getSt()));
        zzzVo.setEn(convertDate(zzz.getEn()));
        zzzVo.setTimsta(convertDate(zzz.getTimsta()));
        zzzVo.setZxc(convertDate2(zzz.getZxc()));
        return zzzVo;
    }


    public static void main(String args[]) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");

        Date date = new Date();

        String format = simpleDateFormat.format(date);
        System.out.println("date->String:" + format);
        Date parse = simpleDateFormat.parse(format);
        System.out.println("String->date:" + parse);

        System.out.println("========");
        long time = date.getTime();
        System.out.println("date->long:" + time);
        String format1 = simpleDateFormat.format(new Date(Long.valueOf(time)));
        System.out.println("long->String:"+format1);
    }

    public String convertDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);

        return format;
    }

    public String convertDate2(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);

        return format;
    }
}
