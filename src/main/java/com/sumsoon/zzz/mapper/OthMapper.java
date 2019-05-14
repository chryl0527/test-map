package com.sumsoon.zzz.mapper;

import com.sumsoon.zzz.po.XXX;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created By Chr on 2019/5/13.
 */
public interface OthMapper {
    List<XXX> query0(@Param("maa") String ma);

    List<Map<String, Object>> query1(@Param("maa") String ma);

    List<Map<String, Object>> query2(@Param("paramsMap") Map<String, String> map);

    List<Map<String, Object>> query3(@Param("xxx") XXX x);

    List<Map<String, Object>> query4(@Param("maa") String ma);

    List<Map<String, Object>> query5(@Param("maa") String ma);

    List<Map<String, Object>> query55(@Param("maa") String ma);

    List<Map<String, Object>> query6(@Param("maa") String ma);

}
