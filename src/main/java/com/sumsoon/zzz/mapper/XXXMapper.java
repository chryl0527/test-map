package com.sumsoon.zzz.mapper;

import com.sumsoon.zzz.po.XXX;
import com.sumsoon.zzz.po.XXXExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XXXMapper {
    long countByExample(XXXExample example);

    int deleteByExample(XXXExample example);

    int deleteByPrimaryKey(String maa);

    int insert(XXX record);

    int insertSelective(XXX record);

    List<XXX> selectByExample(XXXExample example);

    XXX selectByPrimaryKey(String maa);

    int updateByExampleSelective(@Param("record") XXX record, @Param("example") XXXExample example);

    int updateByExample(@Param("record") XXX record, @Param("example") XXXExample example);

    int updateByPrimaryKeySelective(XXX record);

    int updateByPrimaryKey(XXX record);
}