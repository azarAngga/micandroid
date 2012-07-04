package com.jshop.entity;
// Generated 2011-12-21 20:50:55 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * GoodsCategoryT generated by hbm2java
 */
public class GoodsCategoryT  implements java.io.Serializable {


     private String goodsCategoryTid;
     private String grade;
     private String metaKeywords;
     private String metaDes;
     private String name;
     private String state;
     private String path;
     private Integer sort;
     private String sign;
     private String goodsTypeId;
     private String parentId;
     private Date createtime;
     private String creatorid;
     private String parentName;
     private String htmlpath;

    public GoodsCategoryT() {
    }

	
    public GoodsCategoryT(String goodsCategoryTid, String grade, String name, String state, String path, String sign, String goodsTypeId, Date createtime, String creatorid) {
        this.goodsCategoryTid = goodsCategoryTid;
        this.grade = grade;
        this.name = name;
        this.state = state;
        this.path = path;
        this.sign = sign;
        this.goodsTypeId = goodsTypeId;
        this.createtime = createtime;
        this.creatorid = creatorid;
    }
    public GoodsCategoryT(String goodsCategoryTid, String grade, String metaKeywords, String metaDes, String name, String state, String path, Integer sort, String sign, String goodsTypeId, String parentId, Date createtime, String creatorid, String parentName, String htmlpath) {
       this.goodsCategoryTid = goodsCategoryTid;
       this.grade = grade;
       this.metaKeywords = metaKeywords;
       this.metaDes = metaDes;
       this.name = name;
       this.state = state;
       this.path = path;
       this.sort = sort;
       this.sign = sign;
       this.goodsTypeId = goodsTypeId;
       this.parentId = parentId;
       this.createtime = createtime;
       this.creatorid = creatorid;
       this.parentName = parentName;
       this.htmlpath = htmlpath;
    }
   
    public String getGoodsCategoryTid() {
        return this.goodsCategoryTid;
    }
    
    public void setGoodsCategoryTid(String goodsCategoryTid) {
        this.goodsCategoryTid = goodsCategoryTid;
    }
    public String getGrade() {
        return this.grade;
    }
    
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getMetaKeywords() {
        return this.metaKeywords;
    }
    
    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }
    public String getMetaDes() {
        return this.metaDes;
    }
    
    public void setMetaDes(String metaDes) {
        this.metaDes = metaDes;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
    public Integer getSort() {
        return this.sort;
    }
    
    public void setSort(Integer sort) {
        this.sort = sort;
    }
    public String getSign() {
        return this.sign;
    }
    
    public void setSign(String sign) {
        this.sign = sign;
    }
    public String getGoodsTypeId() {
        return this.goodsTypeId;
    }
    
    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }
    public String getParentId() {
        return this.parentId;
    }
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    public Date getCreatetime() {
        return this.createtime;
    }
    
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    public String getCreatorid() {
        return this.creatorid;
    }
    
    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid;
    }
    public String getParentName() {
        return this.parentName;
    }
    
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
    public String getHtmlpath() {
        return this.htmlpath;
    }
    
    public void setHtmlpath(String htmlpath) {
        this.htmlpath = htmlpath;
    }




}

