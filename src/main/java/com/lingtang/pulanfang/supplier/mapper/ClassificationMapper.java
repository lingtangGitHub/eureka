package com.lingtang.pulanfang.supplier.mapper;

import com.lingtang.pulanfang.supplier.model.Classification;

public interface ClassificationMapper {
    int deleteByPrimaryKey(String id);

    int insert(Classification record);

    int insertSelective(Classification record);

    Classification selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Classification record);

    int updateByPrimaryKey(Classification record);
}