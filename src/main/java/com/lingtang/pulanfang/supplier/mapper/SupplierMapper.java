package com.lingtang.pulanfang.supplier.mapper;

import com.lingtang.pulanfang.supplier.model.Supplier;
import com.lingtang.pulanfang.supplier.model.extend.selectSupplierList;
import feign.Param;

import java.util.List;
import java.util.Map;

public interface SupplierMapper {
    int deleteByPrimaryKey(String id);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);

    /**
     * 查询所有供应商信息
     *
     * @author 赵鑫泉
     * @date 2019/8/29 16:38
     * @param []
     * @return com.lingtang.pulanfang.supplier.model.Supplier
     */
    List<Map<String,Object>> selectSupplierList(selectSupplierList ssl);
}