package com.bysj.rj.dto;

import com.bysj.rj.entity.PartsEntity;
import com.bysj.rj.util.DateBuilder;

/**
 * @Author: yangliu
 * @Description:
 * @Date: Created in 2017/5/9 0009.
 */
public class PartsEntityDto{

    private String id;

    private String partNum;

    private String partName;

    private String serialNum;

    private String ext;

    private String standard;

    private String brand;

    private String businessName;

    private String produceTime;

    private String createTime;

    private String partition;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPartNum() {
        return partNum;
    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum == null ? null : serialNum.trim();
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
    }

    public String getPartition() {
        return partition;
    }

    public void setPartition(String partition) {
        this.partition = partition == null ? null : partition.trim();
    }

    public String getProduceTime() {
        return produceTime;
    }

    public void setProduceTime(String produceTime) {
        this.produceTime = produceTime;
    }


    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public static PartsEntityDto transDto(PartsEntity entity){
        PartsEntityDto dto = new PartsEntityDto();
        dto.setId(entity.getId().toString());
        dto.setPartNum(entity.getPartNum().toString());
        dto.setPartName(entity.getPartName());
        dto.setSerialNum(entity.getSerialNum());
        dto.setStandard(entity.getStandard());
        dto.setBrand(entity.getBrand());
        dto.setBusinessName(entity.getBusinessName());
        dto.setProduceTime(DateBuilder.formatDate(entity.getProduceTime(),DateBuilder.YYYY_MM_DD));
        dto.setCreateTime(DateBuilder.formatDate(entity.getCreateTime(),DateBuilder.YYYY_MM_DD));
        dto.setPartition(entity.getPartition());
        return dto;
    }

    public static PartsEntity transEntity(PartsEntityDto dto){
        PartsEntity entity = new PartsEntity();
        if(dto.getId()!=null){
            entity.setId(Integer.parseInt(dto.getId()));
        }
        entity.setPartNum(Integer.parseInt(dto.getPartNum()));
        entity.setPartName(dto.getPartName());
        entity.setSerialNum(dto.getSerialNum());
        entity.setStandard(dto.getStandard());
        entity.setBrand(dto.getBrand());
        entity.setBusinessName(dto.getBusinessName());
        entity.setProduceTime(DateBuilder.getDate(DateBuilder.YYYY_MM_DD,dto.getProduceTime()));
        entity.setCreateTime(DateBuilder.getDate(DateBuilder.YYYY_MM_DD,dto.getCreateTime()));
        entity.setPartition(dto.getPartition());
        return entity;
    }
}
