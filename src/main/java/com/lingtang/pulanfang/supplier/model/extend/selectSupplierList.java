package com.lingtang.pulanfang.supplier.model.extend;

import io.swagger.annotations.ApiModelProperty;

/**
 * 查询供应商列表查询参数扩展类
 *
 * @author 赵鑫泉
 * @date 2019/8/30 14:58
 * @param
 * @return
 */
public class selectSupplierList {
    //供应商名称
    @ApiModelProperty(value="供应商名称",name="supplierName",required=true,notes ="供应商名称")
    private String supplierName;
    //联系人
    @ApiModelProperty(value="联系人",name="contacts",required=false,notes ="供应商名称")
    private String contacts;
    //联系方式
    @ApiModelProperty(value="联系方式",name="contactInformation",required=false,notes ="供应商名称")
    private String contactInformation;
    //负责人
    @ApiModelProperty(value="负责人",name="userId",required=false,notes ="供应商名称")
    private String userName;
    //状态
    @ApiModelProperty(value="状态",name="state",required=false,notes ="供应商名称")
    private Integer state;
    //面料号
    @ApiModelProperty(value="面料号",name="fabricNum",required=false,notes ="供应商名称")
    private String fabricNum;
    //所属地
    @ApiModelProperty(value="所属地",name="location",required=false,notes ="供应商名称")
    private String location;
    //一级分类
    @ApiModelProperty(value="一级分类",name="classificationId",required=false,notes ="供应商名称")
    private String classificationId;
    //二级分类
    @ApiModelProperty(value="二级分类",name="classificationTwo",required=false,notes ="供应商名称")
    private String classificationTwo;

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getFabricNum() {
        return fabricNum;
    }

    public void setFabricNum(String fabricNum) {
        this.fabricNum = fabricNum;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(String classificationId) {
        this.classificationId = classificationId;
    }

    public String getClassificationTwo() {
        return classificationTwo;
    }

    public void setClassificationTwo(String classificationTwo) {
        this.classificationTwo = classificationTwo;
    }
}
