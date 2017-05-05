package test.com.bysj.rj.entity;

public class TruckPlanEntity {
    private Long planId;

    private String truckType;

    private Byte isFinish;

    private String planNumber;

    private Integer planVolume;

    private Integer goodVolume;

    private Integer remainVolume;

    private Integer badVolume;

    private Long planDate;

    private Long produceDate;

    private Long finishDate;

    private String check;

    private String remark;

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType == null ? null : truckType.trim();
    }

    public Byte getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(Byte isFinish) {
        this.isFinish = isFinish;
    }

    public String getPlanNumber() {
        return planNumber;
    }

    public void setPlanNumber(String planNumber) {
        this.planNumber = planNumber == null ? null : planNumber.trim();
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

    public Integer getRemainVolume() {
        return remainVolume;
    }

    public void setRemainVolume(Integer remainVolume) {
        this.remainVolume = remainVolume;
    }

    public Integer getBadVolume() {
        return badVolume;
    }

    public void setBadVolume(Integer badVolume) {
        this.badVolume = badVolume;
    }

    public Long getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Long planDate) {
        this.planDate = planDate;
    }

    public Long getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(Long produceDate) {
        this.produceDate = produceDate;
    }

    public Long getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Long finishDate) {
        this.finishDate = finishDate;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check == null ? null : check.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}