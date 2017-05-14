package test.com.bysj.rj.entity;

public class TruckEntity {
    private Long truckId;

    private String batch;

    private String type;

    private Integer dpId;

    private Byte state;

    private Byte isDoing;

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

    public Integer getDpId() {
        return dpId;
    }

    public void setDpId(Integer dpId) {
        this.dpId = dpId;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getIsDoing() {
        return isDoing;
    }

    public void setIsDoing(Byte isDoing) {
        this.isDoing = isDoing;
    }
}