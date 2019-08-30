package com.lingtang.pulanfang.supplier.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lingtang.pulanfang.supplier.model.Supplier;
import com.lingtang.pulanfang.supplier.model.extend.selectSupplierList;
import com.lingtang.pulanfang.supplier.service.SupplierService;
import com.lingtang.pulanfang.supplier.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sup")
@Api("运营商管理")
public class SupplierController {

    @Resource
    private SupplierService service;

    /**
     *
     * 查询
     * @author 赵鑫泉
     * @date 2019/8/30 9:54
     * @param []
     * @return com.lingtang.pulanfang.supplier.utils.R
     */
    @RequestMapping(value = "selectSupplierList",method = RequestMethod.GET)
    @ApiOperation("查询供应商列表")
    public R selectSupplierList(@ApiParam(name="查询条件",value="对象格式",required = true) selectSupplierList ssl){
        try {
            List<Map<String,Object>> supplier = service.selectSupplierList(ssl);
            if(supplier.size() != 0){
                return new R<>(supplier);
            }
            return new R<>(1,"暂无消息",new JSONArray());
        } catch (Exception e) {
            e.printStackTrace();
            return new R<>(1,e.getMessage(),new JSONArray());
        }
    }

    /**
     * 新增运营商
     *
     * @author 赵鑫泉
     * @date 2019/8/30 10:07
     * @param [sup]
     * @return com.lingtang.pulanfang.supplier.utils.R
     */
    @RequestMapping(value = "insertSupplier",method = RequestMethod.POST)
    @ApiOperation("新增运营商")
    public R insertSupplier(@RequestBody @ApiParam(name="供应商对象",value="传入json格式",required = true) Supplier sup){
        try {
            int i = service.insertSupplier(sup);
            if(i != 0){
                return new R<>("添加成功");
            }
            return new R<>(1,"添加失败，服务器异常",new JSONObject());
        } catch (Exception e) {
            e.printStackTrace();
            return new R<>(1,e.getMessage(),new JSONObject());
        }
    }

    /**
     * 删除供应商信息
     *
     * @author 赵鑫泉
     * @date 2019/8/30 11:19
     * @param [id]
     * @return com.lingtang.pulanfang.supplier.utils.R
     */
    @RequestMapping(value = "deleteSupplier",method = RequestMethod.GET)
    @ApiOperation("删除供应商（伪删）")
    @ApiImplicitParam(name = "id", value = "供应商id", required = true, paramType = "query", dataType = "String")
    public R deleteSupplier(String id){
        try {
            int i = service.deleteSupplier(id);
            if(i != 0){
                return new R<>("删除成功");
            }
            return new R<>(1,"删除失败，服务器异常",new JSONObject());
        } catch (Exception e) {
            e.printStackTrace();
            return new R<>(1,e.getMessage(),new JSONObject());
        }
    }

    @RequestMapping(value = "selectSupplierById",method = RequestMethod.GET)
    @ApiOperation("根据id查询供应商信息")
    @ApiImplicitParam(name="id",value = "供应商id",required = true,paramType = "query",dataType = "String")
    public R selectSupplierById(String id){
        try {
            Supplier supplier = service.selectSupplierById(id);
            if(supplier != null){
                return new R<>(supplier);
            }
            return new R<>(1,"暂无信息",new JSONObject());
        } catch (Exception e) {
            e.printStackTrace();
            return new R<>(1,e.getMessage(),new JSONObject());
        }
    }
}
