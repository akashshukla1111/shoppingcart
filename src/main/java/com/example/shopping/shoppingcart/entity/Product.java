package com.example.shopping.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    private String name;
    private int itemNumber;
    private int price;
    private int qty;
    private String unit;

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Product() {
    }

    public Product(String name, int price, int qty) {
        this(name,price,qty,null);
    }

    public Product(String name, int price, int qty, String unit) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.unit = unit;
    }

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getUnit() {
        return unit;
    }
}
