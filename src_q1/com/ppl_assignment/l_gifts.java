
package com.ppl_assignment;

public class l_gifts {

    private double price;                                    //price of gift
    private double value;                                    //value of gift
    private double l_rate;                                    //luxury rate of gift
    private double diff;                                     //difficulty in obtaining in the gift
    l_gifts(double price, double value,double lrate,double diff){
        this.price=price;
        this.value=value;
        this.l_rate=lrate;
        this.diff=diff;
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

    public double getL_rate() {
        return l_rate;
    }

    public void setL_rate(double l_rate) {
        this.l_rate = l_rate;
    }

    public double getDiff() {
        return diff;
    }

    public void setDiff(double diff) {
        this.diff = diff;
    }

}
