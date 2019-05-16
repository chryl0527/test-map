package com.sumsoon.zzz.mapper;

import com.sumsoon.zzz.po.ZZZ;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created By Chr on 2019/5/15.
 */
public interface OthZzzMapper {

    List<ZZZ> query01(@Param("st") Date st, @Param("en") Date en);
}
