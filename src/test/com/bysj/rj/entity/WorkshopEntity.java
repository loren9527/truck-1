package test.com.bysj.rj.entity;

public class WorkshopEntity {
    private Integer workId;

    private String name;

    private String address;

    private Byte workState;

    private Byte health;

    private Long dpId;

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Byte getWorkState() {
        return workState;
    }

    public void setWorkState(Byte workState) {
        this.workState = workState;
    }

    public Byte getHealth() {
        return health;
    }

    public void setHealth(Byte health) {
        this.health = health;
    }

    public Long getDpId() {
        return dpId;
    }

    public void setDpId(Long dpId) {
        this.dpId = dpId;
    }
}