package com.bysj.rj.entity;

public class TruckEntity {
    private Long truckId;

    private String batch;

    private String type;

    private Long dpId;

    private Byte state;

    private Long date;

    private String strDate;


    public Long getTruckId() {
        return truckId;
    }



    public void setTruckId(Long truckId) {
        this.truckId = truckId;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Long getDpId() {
        return dpId;
    }

    public void setDpId(Long dpId) {
        this.dpId = dpId;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }
    public String getStrDate() {
        return strDate;
    }
}