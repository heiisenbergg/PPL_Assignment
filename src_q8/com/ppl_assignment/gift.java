package com.ppl_assignment;

public class gift {
    private double price;
    private double value;
    gift(double price,double value){
        this.price = price;
        this.value = value;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
