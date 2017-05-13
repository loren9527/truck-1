package com.bysj.rj.dto;

import com.bysj.rj.entity.CheckInfoEntity;
import com.bysj.rj.util.DateBuilder;

/**
 * @Author: yangliu
 * @Description:
 * @Date: Created in 2017/5/13 0013.
 */
public class CheckInfoEntityDto {
    private String id;

    private String truckId;

    private String checkResult;

    private String techType;

    private String batch;

    private String checkUser;

    private String checkTime;

    private String produceTime;

    public String getProduceTime() {
        return produceTime;
    }

    public void setProduceTime(String produceTime) {
        this.produceTime = produceTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public String getTechType() {
        return techType;
    }

    public void setTechType(String techType) {
        this.techType = techType;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCheckUser() {
        return checkUser;
    }

    public void setCheckUser(String checkUser) {
        this.checkUser = checkUser;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public static CheckInfoEntityDto transDto(CheckInfoEntity entity){
        CheckInfoEntityDto dto = new CheckInfoEntityDto();
        dto.setId(entity.getId().toString());
        dto.setTruckId(entity.getTruckId().toString());
        dto.setCheckResult(entity.getCheckResult());
        dto.setTechType(entity.getTechType());
        dto.setBatch(entity.getBatch());
        dto.setCheckUser(entity.getCheckUser());
        dto.setProduceTime(DateBuilder.formatDate(entity.getProduceTime(),DateBuilder.YYYY_MM_DD_HH_mm_ss));
        dto.setCheckTime(DateBuilder.formatDate(entity.getCheckTime(),DateBuilder.YYYY_MM_DD_HH_mm_ss));
        return dto;
    }

    public static CheckInfoEntity transEntity(CheckInfoEntityDto dto){
        CheckInfoEntity entity = new CheckInfoEntity();
        if(dto.getId()!=null && !dto.getId().equals("")){
            entity.setId(Long.parseLong(dto.getId()));
        }
        entity.setTruckId(Integer.parseInt(dto.getTruckId()));
        entity.setCheckResult(dto.getCheckResult());
        entity.setTechType(dto.getTechType());
        entity.setBatch(dto.getBatch());
        entity.setCheckUser(dto.getCheckUser());
        entity.setProduceTime(DateBuilder.getDate(DateBuilder.YYYY_MM_DD_HH_mm_ss,dto.getProduceTime()));
        entity.setCheckTime(DateBuilder.getDate(DateBuilder.YYYY_MM_DD_HH_mm_ss,dto.getCheckTime()));

        return entity;
    }


}
