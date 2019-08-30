package com.lingtang.pulanfang.supplier.service.impl;

import com.lingtang.pulanfang.supplier.mapper.SupplierMapper;
import com.lingtang.pulanfang.supplier.model.Supplier;
import com.lingtang.pulanfang.supplier.model.extend.selectSupplierList;
import com.lingtang.pulanfang.supplier.service.SupplierService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service("SupplierService")
public class SupplierServiceImpl implements SupplierService {

    @Resource
    private SupplierMapper mapper;

    @Override
    public List<Map<String,Object>> selectSupplierList(selectSupplierList ssl) {
        List<Map<String,Object>> supplier = mapper.selectSupplierList(ssl);
        return supplier;
    }

    @Override
    public int insertSupplier(Supplier sup) {
        sup.setId(UUID.randomUUID().toString());
        sup.setCreateDate(LocalDateTime.now());
        sup.setUpdateDate(LocalDateTime.now());
        sup.setDelFlag(0);
        int insert = mapper.insertSelective(sup);
        return insert;
    }

    @Override
    public int deleteSupplier(String id) {
        Supplier sup = new Supplier();
        sup.setId(id);
        sup.setDelFlag(1);
        int i = mapper.updateByPrimaryKey(sup);
        return i;
    }

    @Override
    public Supplier selectSupplierById(String id) {
        Supplier supplier = mapper.selectByPrimaryKey(id);
        return supplier;
    }
}
