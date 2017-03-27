package com.ppl_assignment;
public class e_gifts {
    private double price;                                    //price
    private double value;                                    //value
        e_gifts(double tprice, double tvalue){
        this.price=tprice;
        this.value=tvalue;
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
