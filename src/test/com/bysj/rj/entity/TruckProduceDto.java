package test.com.bysj.rj.entity;

public class TruckProduceDto {
    private Long id;

    private String truckNumber;

    private String date;

    private String state;

    private String employeePlace;

    private String employeeName;

    private String employeeGrade;

    private String currentOperation;

    private String trucktype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(String truckNumber) {
        this.truckNumber = truckNumber == null ? null : truckNumber.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getEmployeePlace() {
        return employeePlace;
    }

    public void setEmployeePlace(String employeePlace) {
        this.employeePlace = employeePlace == null ? null : employeePlace.trim();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public String getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(String employeeGrade) {
        this.employeeGrade = employeeGrade == null ? null : employeeGrade.trim();
    }

    public String getCurrentOperation() {
        return currentOperation;
    }

    public void setCurrentOperation(String currentOperation) {
        this.currentOperation = currentOperation == null ? null : currentOperation.trim();
    }

    public String getTrucktype() {
        return trucktype;
    }

    public void setTrucktype(String trucktype) {
        this.trucktype = trucktype == null ? null : trucktype.trim();
    }
}