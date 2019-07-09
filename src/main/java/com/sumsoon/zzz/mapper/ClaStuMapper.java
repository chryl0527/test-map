package com.sumsoon.zzz.mapper;

import com.sumsoon.service.model.StuClazModel;
import com.sumsoon.zzz.po.Companys;
import com.sumsoon.zzz.po.Orders;

import java.util.List;
import java.util.Map;

/**
 * Created By Chr on 2019/7/9.
 */
public interface ClaStuMapper {

    List<StuClazModel> queryClazStu();

    List<Map<String, Object>> queryClazStuFromMap();

    List<Orders> queryOrdersAndOrderDetailAndItems();
    List<Companys> queryCompStaffs();

}
