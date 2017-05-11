package com.bysj.rj.entity;

public class DayPlanEntity {
    private Long dpId;

    private Long date;

    private Integer planVolume;

    private Integer goodVolume;

    private Integer badVolume;

    private Byte isFinish;

    private String remark;

    private Long truckPlanId;

    public Long getDpId() {
        return dpId;
    }

    public void setDpId(Long dpId) {
        this.dpId = dpId;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Integer getPlanVolume() {
        return planVolume;
    }

    public void setPlanVolume(Integer planVolume) {
        this.planVolume = planVolume;
    }

    public Integer getGoodVolume() {
        return goodVolume;
    }

    public void setGoodVolume(Integer goodVolume) {
        this.goodVolume = goodVolume;
    }

    public Integer getBadVolume() {
        return badVolume;
    }

    public void setBadVolume(Integer badVolume) {
        this.badVolume = badVolume;
    }

    public Byte getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(Byte isFinish) {
        this.isFinish = isFinish;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getTruckPlanId() {
        return truckPlanId;
    }

    public void setTruckPlanId(Long truckPlanId) {
        this.truckPlanId = truckPlanId;
    }
}