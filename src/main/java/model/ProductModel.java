package model;

import java.sql.Timestamp;

public class ProductModel {
    private long id;
    private String name;
    private String unit;
    private int amount;
    private Timestamp mfg;
    private Timestamp exp;
    private int price;
    private String shift;
    private String desciption;
    private Long categoryId;

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getUnit() { return unit; }

    public void setUnit(String unit) { this.unit = unit; }

    public int getAmount() { return amount; }

    public void setAmount(int amount) { this.amount = amount; }

    public Timestamp getMfg() { return mfg; }

    public void setMfg(Timestamp mfg) { this.mfg = mfg; }

    public Timestamp getExp() { return exp; }

    public void setExp(Timestamp exp) { this.exp = exp; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public String getShift() { return shift; }

    public void setShift(String shift) { this.shift = shift; }

    public String getDesciption() { return desciption; }

    public void setDesciption(String desciption) { this.desciption = desciption; }

    public Long getCategoryId() { return categoryId; }

    public void setCategoryId(Long categoryId) { this.categoryId = categoryId; }
}
