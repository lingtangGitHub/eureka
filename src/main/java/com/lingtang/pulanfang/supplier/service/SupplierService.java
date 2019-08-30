package com.lingtang.pulanfang.supplier.service;

import com.lingtang.pulanfang.supplier.model.Supplier;
import com.lingtang.pulanfang.supplier.model.extend.selectSupplierList;

import java.util.List;
import java.util.Map;

/**
 * 供应商管理服务层接口
 *
 * @author 赵鑫泉
 * @date 2019/8/29 16:39
 * @param
 * @return
 */
public interface SupplierService {
    /**
     * 查询所有供应商信息
     *
     * @author 赵鑫泉
     * @date 2019/8/29 16:39
     * @param []
     * @return com.lingtang.pulanfang.supplier.model.Supplier
     */
    List<Map<String,Object>> selectSupplierList(selectSupplierList ssl);

    /**
     * 新增供应商
     *
     * @author 赵鑫泉
     * @date 2019/8/30 9:58
     * @param [sup]
     * @return int
     */
    int insertSupplier(Supplier sup);

    /**
     * 删除供应商（伪删）
     *
     * @author 赵鑫泉
     * @date 2019/8/30 11:15
     * @param [id]
     * @return int
     */
    int deleteSupplier(String id);

    /**
     * 根据id查询供应商信息
     *
     * @author 赵鑫泉
     * @date 2019/8/30 14:52
     * @param [id]
     * @return com.lingtang.pulanfang.supplier.model.Supplier
     */
    Supplier selectSupplierById(String id);
}
