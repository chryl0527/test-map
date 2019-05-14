package com.sumsoon.zzz.mapper;

import com.sumsoon.zzz.po.ZZZ;
import com.sumsoon.zzz.po.ZZZExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZZZMapper {
    long countByExample(ZZZExample example);

    int deleteByExample(ZZZExample example);

    int deleteByPrimaryKey(String qwe);

    int insert(ZZZ record);

    int insertSelective(ZZZ record);

    List<ZZZ> selectByExample(ZZZExample example);

    ZZZ selectByPrimaryKey(String qwe);

    int updateByExampleSelective(@Param("record") ZZZ record, @Param("example") ZZZExample example);

    int updateByExample(@Param("record") ZZZ record, @Param("example") ZZZExample example);

    int updateByPrimaryKeySelective(ZZZ record);

    int updateByPrimaryKey(ZZZ record);
}