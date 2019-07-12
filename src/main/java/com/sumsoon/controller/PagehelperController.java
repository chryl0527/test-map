package com.sumsoon.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sumsoon.zzz.mapper.CityMapper;
import com.sumsoon.zzz.po.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created By Chr on 2019/7/12.
 */
@RestController
@RequestMapping("/page")
public class PagehelperController {

    @Autowired
    private CityMapper cityMapper;

    //原生的PageHelper
    @RequestMapping("/show1")
    public Object show1() {
        int page = 1;
        int rows = 3;
        PageHelper.startPage(page, rows);
        List<City> list = cityMapper.queryCityList();
        PageInfo<City> pi = new PageInfo<>(list);
        Map<String, Object> map = new HashMap<>();
        map.put("total", pi.getTotal());
        map.put("rows", list);
        return map;
    }

    //starter的PageHelper
    @RequestMapping("/show2")
    public Object show2() {
        int pageNum = 1;
        int pageSize = 3;
        //使用分页插件,核心代码就这一行
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（Select）方法会被分页
        PageHelper.startPage(pageNum, pageSize);
        List<City> cities = cityMapper.queryCityList();
        // 获取
        PageInfo<City> pageInfo = new PageInfo<>(cities);
        return pageInfo;

    }
}
