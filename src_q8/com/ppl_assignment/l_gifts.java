
package com.ppl_assignment;

public class l_gifts extends gift{
    private double l_rate;                                    //luxury rate of gift
    private double diff;                                     //difficulty in obtaining in the gift
    l_gifts(double price, double value,double lrate,double diff){
       super(price,value);
        this.l_rate=lrate;
        this.diff=diff;
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
