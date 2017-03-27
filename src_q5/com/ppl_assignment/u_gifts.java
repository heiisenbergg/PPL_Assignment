
package com.ppl_assignment;

public class u_gifts extends gift{
    private double u_value;                                   //utility value of gift
    private double u_class;                                   //utility class of gift
    u_gifts(double price, double value,double uvalue,double uclass){
        super(price,value);
        this.u_value=uvalue;
        this.u_class=uclass;
    }
    public double getU_value() {
        return u_value;
    }

    public void setU_value(double u_value) {
        this.u_value = u_value;
    }

    public double getU_class() {
        return u_class;
    }

    public void setU_class(double u_class) {
        this.u_class = u_class;
    }

}
