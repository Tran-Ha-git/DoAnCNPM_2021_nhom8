package model;

public class ImportModel {
    private Long id;
    private Long employeeId;
    private Long customerId;
    private Long billId;
    private String receiver;
    private String deliver;
    private String desdcription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getDeliver() {
        return deliver;
    }

    public void setDeliver(String deliver) {
        this.deliver = deliver;
    }

    public String getDesdcription() {
        return desdcription;
    }

    public void setDesdcription(String desdcription) {
        this.desdcription = desdcription;
    }
}
