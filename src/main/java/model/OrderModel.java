package model;

public class OrderModel {
    private Long id;
    private Long employeeId;
    private Long customerId;
    private int discount;
    private Long pay;
    private Long change;

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

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Long getPay() {
        return pay;
    }

    public void setPay(Long pay) {
        this.pay = pay;
    }

    public Long getChange() {
        return change;
    }

    public void setChange(Long change) {
        this.change = change;
    }
}
