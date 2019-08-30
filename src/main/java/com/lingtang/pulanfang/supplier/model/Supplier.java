package com.lingtang.pulanfang.supplier.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Supplier implements Serializable {
    //id
    @ApiModelProperty(value="id",name="id",hidden = true)
    private String id;
    //供应商名称
    @ApiModelProperty(value="供应商名称",name="supplierName",required=true,notes ="供应商名称")
    private String supplierName;
    //状态(0合作中 1未合作)
    @ApiModelProperty(value="状态(0合作中 1未合作)",name="state",required=true)
    private Integer state;
    //说明
    @ApiModelProperty(value="说明",name="explain",required = false)
    private String explain;
    //面料号
    @ApiModelProperty(value="面料号",name="fabricNum",required = false)
    private String fabricNum;
    //所属地
    @ApiModelProperty(value="所属地",name="location",required=false)
    private String location;
    //一级分类
    @ApiModelProperty(value="一级分类",name="classificationId",required=true)
    private String classificationId;
    //二级分类
    @ApiModelProperty(value="二级分类",name="classificationTwo",required=true)
    private String classificationTwo;
    //负责人
    @ApiModelProperty(value="负责人",name="userId",required=true)
    private String userId;
    //联系人
    @ApiModelProperty(value="联系人",name="contacts",required=true)
    private String contacts;
    //联系方式
    @ApiModelProperty(value="联系方式",name="contactInformation",required=true)
    private String contactInformation;
    //创建人
    @ApiModelProperty(value="创建人",name="createBy",required=true)
    private String createBy;
    //创建时间
    @ApiModelProperty(value="创建时间",name="createDate",hidden = true)
    private LocalDateTime createDate;
    //修改人
    @ApiModelProperty(value="修改人",name="updateBy",required=true)
    private String updateBy;
    //修改时间
    @ApiModelProperty(value="修改时间",name="updateDate",hidden = true)
    private LocalDateTime updateDate;
    //是否删除（0未删除 1已删除）
    @ApiModelProperty(value="是否删除",name="delFlag",hidden = true)
    private Integer delFlag;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", supplierName=").append(supplierName);
        sb.append(", state=").append(state);
        sb.append(", explain=").append(explain);
        sb.append(", fabricNum=").append(fabricNum);
        sb.append(", location=").append(location);
        sb.append(", classificationId=").append(classificationId);
        sb.append(", classificationTwo=").append(classificationTwo);
        sb.append(", userId=").append(userId);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}