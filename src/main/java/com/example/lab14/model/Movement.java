package com.example.lab14.model;

import java.util.Date;

public class Movement {

    private String type;

    private double amount;
    private String description;
    private Date date;

    public Movement(String type, double amount, String description, Date date) {
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
