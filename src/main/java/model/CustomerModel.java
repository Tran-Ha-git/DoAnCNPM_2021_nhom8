package model;

import java.sql.Timestamp;

public class CustomerModel {
    private Long id;
    private String fullname;
    private int pointShopping;
    private Timestamp birthday;
    private String address;
    private String email;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getFullname() {return fullname; }

    public void setFullname(String fullname) { this.fullname = fullname; }

    public int getPointShopping() { return pointShopping; }

    public void setPointShopping(int pointShopping) { this.pointShopping = pointShopping; }

    public Timestamp getBirthday() { return birthday; }

    public void setBirthday(Timestamp birthday) { this.birthday = birthday; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }
}
