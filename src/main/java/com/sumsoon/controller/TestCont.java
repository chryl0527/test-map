package com.sumsoon.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sumsoon.zzz.mapper.OthMapper;
import com.sumsoon.zzz.mapper.XXXMapper;
import com.sumsoon.zzz.po.XXX;
import com.sumsoon.zzz.po.XXXExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * Created By Chr on 2019/5/13.
 */

@Slf4j
@RestController
@RequestMapping(value = "/te")
public class TestCont {


    @Autowired
    private XXXMapper xxxMapper;
    @Resource
    private OthMapper othMapper;

    @RequestMapping(value = "/st0")
    public String show0() {


        return "suc";
    }

    @RequestMapping(value = "/st")
    public String show() {

        xxxMapper.insertSelective(new XXX("127", "345", "456", "987"));
        xxxMapper.insertSelective(new XXX("128", "345", "456", "987"));
        xxxMapper.insertSelective(new XXX("129", "345", "456", "987"));

        return "suc";
    }

    @RequestMapping("/st1")
    public Object show1() {
        List<XXX> xxxes = othMapper.query0("12");

        return xxxes;
    }

    //mybatis-generator:的模糊查询
    @RequestMapping("/st2")
    public Object show2() {
        XXXExample example = new XXXExample();
        XXXExample.Criteria criteria = example.createCriteria();
//        criteria.andMaaLike("123");
        criteria.andMaaLike("12" + "%");

        List<XXX> xxxes = xxxMapper.selectByExample(example);

        return xxxes;
    }

    @RequestMapping("/st3")
    public Object show3() {

        List<Map<String, Object>> maps = othMapper.query1("12");
        return maps;

    }

    @RequestMapping("/st4")
    public Object show4() {

        Map<String, String> map = new HashMap<>();
        map.put("maa", "12");

        List<Map<String, Object>> maps = othMapper.query2(map);
        return maps;

    }

    @RequestMapping("/st5")
    public Object show5() {

        List<Map<String, Object>> maps = othMapper.query3(new XXX("12", "", "", ""));

        return maps;

    }

    @RequestMapping("/st6")
    public Object show6() {
        List<Map<String, Object>> maps = othMapper.query4("12");

        return maps;

    }

    @RequestMapping("/st7")
    public Object show7() {
        List<Map<String, Object>> maps = othMapper.query5("12");

        return maps;

    }

    @RequestMapping("/st77")
    public Object show77() {
        List<Map<String, Object>> maps = othMapper.query55("12");

        return maps;

    }

    @RequestMapping("/st8")
    public Object show8() {


        List<Map<String, Object>> maps = othMapper.query6("12");

        return maps;

    }

    //======================================
    @RequestMapping("/st9")
    public XXObj show9() {
        List<Map<String, Object>> maps = othMapper.query6("12");


        XXObj obj = new XXObj();
        obj.setData(maps);
        obj.setStatus("200");
        return obj;
    }

    @RequestMapping("/st10")
    public Map
        //List
    show10() {
        Map<String, String> map = new HashMap<>();
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

        return map;
//        return list;
    }

    @RequestMapping("/st11")
    public void show11() {

        String s = JSON.toJSONString(othMapper.query6("12"));
        System.err.println(s);
        JSONArray jsonArray = JSON.parseArray(s);
        System.err.println(jsonArray);

//        Object o = jsonArray.get(126);
//        System.err.println(o);

        Object[] objects = jsonArray.toArray();


        for (int x = 0; x < objects.length; x++) {
            Map<String, Object> map = (Map<String, Object>) objects[x];
            XXX xxx = new XXX();
            xxx.setMaa((String) map.get("maa"));
            xxx.setSadf((String) map.get("sadf"));
            xxx.setSfds((String) map.get("sfds"));
            xxx.setWrsa((String) map.get("wrsa"));
            System.err.println(map);
            System.err.println(xxx + "====");

        }
    }

    @RequestMapping("/st12")
    public XXObj show12() {

        List<Map<String, Object>> maps = othMapper.query6("12");
        XXObj xxObj = new XXObj();
        xxObj.setData(maps);
        xxObj.setStatus("sadf");
        System.out.println(xxObj);
        return xxObj;
    }

    //测试异步返回
    @RequestMapping("/st13")
    public Callable<XXObj> show13() {

        return () -> {
            List<Map<String, Object>> maps = othMapper.query6("12");
            XXObj xxObj = new XXObj();
            xxObj.setData(maps);
            xxObj.setStatus("aaxf");
            System.out.println(xxObj);
            return xxObj;
        };
    }

    //测试resultMap
    @RequestMapping("/st14")
    public Object show14() {
        return othMapper.query7("12");

    }


    //##################################模拟service层#####################################//
    ExecutorService executorService = Executors.newFixedThreadPool(4);


    @RequestMapping("/st15")
    public Object show15() throws ExecutionException, InterruptedException {

        long startTime = System.currentTimeMillis();
        System.out.println("当前主线程为：" + Thread.currentThread() + " --->主线程开始时间：" + System.currentTimeMillis());

        Callable<List<Map<String, Object>>> callable = () -> {
            List<Map<String, Object>> maps = othMapper.query6("12");
            List<Map<String, Object>> maps2 = othMapper.query6("12");
            List<Map<String, Object>> maps3 = othMapper.query6("12");
            List<Map<String, Object>> maps4 = othMapper.query6("12");
            List<Map<String, Object>> maps5 = othMapper.query6("12");

            System.out.println(maps);
            return maps;
        };

        FutureTask futureTask = new FutureTask(callable);
        Future<?> future = executorService.submit(futureTask);
        System.err.println(futureTask.get());
        if (future.isDone()) {

            System.err.println("done");
            System.out.println("当前主线程为：" + Thread.currentThread() + " --->接口结束时间：" + System.currentTimeMillis());
            System.out.println("接口执行时间：" + (System.currentTimeMillis() - startTime));
        }
        return futureTask.get();

    }

    @RequestMapping("/st16")
    public Object show16() {
        long startTime = System.currentTimeMillis();

        System.out.println("当前主线程为：" + Thread.currentThread() + " --->主线程开始时间：" + System.currentTimeMillis());

        List<Map<String, Object>> maps = othMapper.query6("12");
        List<Map<String, Object>> maps2 = othMapper.query6("12");
        List<Map<String, Object>> maps3 = othMapper.query6("12");
        List<Map<String, Object>> maps4 = othMapper.query6("12");
        List<Map<String, Object>> maps5 = othMapper.query6("12");

        System.out.println("当前主线程为：" + Thread.currentThread() + " --->接口结束时间：" + System.currentTimeMillis());
        System.out.println("接口执行时间：" + (System.currentTimeMillis() - startTime));
        return maps;

    }

    //restFUL:同时处理两个请求,{ac}不是必需的,(有id和没id)
    @RequestMapping(value = {"/st17/{maa}/{ac}", "/st17/{maa}"}, method = RequestMethod.GET)//@RequestMapping是可以处理多个url的
    public Object show17(@PathVariable(value = "maa") String ma,
                         @PathVariable(value = "ac", required = false) String a) {
        List<Map<String, Object>> maps = null;
        if (a != null) {
            System.out.println(" select  by primaryKey");
        } else {
            maps = othMapper.query6(ma);
        }
        return maps;
    }

    public static void main(String args[]) {
        Map<String, String> map = new HashMap<>();
        map.put("maa", "12");
        map.put("3", "12");
        map.put("ma4a", "12");
        map.put("ma2a", "12");
        map.put("m1aa", "12");
        Map<String, String> map2 = new HashMap<>();
        map2.put("1", "a");
        map2.put("2", "b");
        map2.put("3", "c");
        map2.put("4", "d");
        map2.put("5", "e");
        String s = JSON.toJSONString(map.toString());
        System.out.println(s);
        JSONObject jsonObject=new JSONObject();
        //put能结合在一起,有key,
//        jsonObject.put("map-1",map);
//        jsonObject.put("map-2",map2);
        //putAll也能,无key,完全融合
        jsonObject.putAll(map);
        jsonObject.putAll(map2);
        System.out.println(jsonObject.toString());

//        Object parse = JSONObject.parse(map.toString());
//        System.out.println(parse);

    }

    @GetMapping(value = {"/st18"})
    public Object show18(){
//        return othMapper.query8(null,null,"12");
//        return othMapper.query8(2,2,"1");
        return othMapper.query8(null,2,"12");
//        return othMapper.query8(2,null,"12");
    }
}
