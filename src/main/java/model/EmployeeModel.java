package model;

import java.sql.Timestamp;

public class EmployeeModel {
    private Long id;
    private String fullname;
    private String email;
    private String phone;
    private Timestamp birhday;
    private Timestamp beginday;
    private int salary;
    private String shift;
    private String department;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getFullname() { return fullname; }

    public void setFullname(String fullname) { this.fullname = fullname; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public Timestamp getBirhday() { return birhday; }

    public void setBirhday(Timestamp birhday) { this.birhday = birhday; }

    public Timestamp getBeginday() { return beginday; }

    public void setBeginday(Timestamp beginday) { this.beginday = beginday; }

    public int getSalary() { return salary; }

    public void setSalary(int salary) { this.salary = salary; }

    public String getShift() { return shift; }

    public void setShift(String shift) { this.shift = shift; }

    public String getDepartment() { return department; }

    public void setDepartment(String department) { this.department = department; }
}
