package com.bysj.rj.entity;

public class PartsEntity {
    private Long partId;

    private String partName;

    private String serialNumber;

    private String typeNumber;

    private String standard;

    private String brand;

    private String businessName;

    private Long produceTime;

    private Long storageTime;

    private String partition;

    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public String getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(String typeNumber) {
        this.typeNumber = typeNumber == null ? null : typeNumber.trim();
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

    public Long getProduceTime() {
        return produceTime;
    }

    public void setProduceTime(Long produceTime) {
        this.produceTime = produceTime;
    }

    public Long getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(Long storageTime) {
        this.storageTime = storageTime;
    }

    public String getPartition() {
        return partition;
    }

    public void setPartition(String partition) {
        this.partition = partition == null ? null : partition.trim();
    }
}