package com.sumsoon.zzz.mapper;

import com.sumsoon.zzz.po.CCC;
import com.sumsoon.zzz.po.CCCExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CCCMapper {
    long countByExample(CCCExample example);

    int deleteByExample(CCCExample example);

    int deleteByPrimaryKey(Integer testId);

    int insert(CCC record);

    int insertSelective(CCC record);

    List<CCC> selectByExample(CCCExample example);

    CCC selectByPrimaryKey(Integer testId);

    int updateByExampleSelective(@Param("record") CCC record, @Param("example") CCCExample example);

    int updateByExample(@Param("record") CCC record, @Param("example") CCCExample example);

    int updateByPrimaryKeySelective(CCC record);

    int updateByPrimaryKey(CCC record);

    // useGeneratedKeys
    int insertUseGeneratedKeys(@Param("c") CCC ccc);
}