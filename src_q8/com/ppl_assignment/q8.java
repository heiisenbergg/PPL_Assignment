package com.ppl_assignment;

import static java.lang.Math.max;

abstract class Filling_Basket{
    public abstract double miser_makebasket(double b_budget, couples couples);
    public abstract double generous_makebasket(double b_budget, couples couples);
    public abstract double geek_makebasket(double b_budget, couples couples);
}
class Basket_primitive extends Filling_Basket{
    public double miser_makebasket(double b_budget,couples couples){
        double budget=b_budget;
        double ess_price=0.0,ess_value=0.0;
        double lux_price=0.0,lux_value=0.0;
        double util_price=0.0,util_value=0.0;
        if(budget>0) {
            double arr[] = couples.essential_buy(couples.getMaint_cost(),3);
            ess_price=arr[0];ess_value=arr[1];
            budget -= ess_price;
            if(ess_price == 0){
                b_budget += 1000;
                arr = couples.essential_buy(b_budget,5);
                ess_price=arr[0];ess_value=arr[1];
            }
            budget -= ess_price;
        }
        if(budget>0) {
            double arr[] = couples.luxury_buy(budget,5);
            lux_price=arr[0];lux_value=arr[1];
            budget -= lux_price;
        }
        if(budget>0) {
            double arr[] = couples.utility_buy(budget,5);
            util_price=arr[0];util_value=arr[1];
            budget -= util_price;
        }
        couples.girl_happy(ess_price,lux_price,util_price,ess_value,lux_value,util_value);
        couples.boy_happy();
        return budget;
    }

    public double generous_makebasket(double b_budget,couples couples){
        double budget=b_budget;
        double ess_price=0.0,ess_value=0.0;
        double lux_price=0.0,lux_value=0.0;
        double util_price=0.0,util_value=0.0;
        if(budget>0) {
            double arr[] = couples.essential_buy(budget,5);
            ess_price=arr[0];
            ess_value=arr[1];
            if(ess_price == 0){
                b_budget +=1000;
                arr = couples.essential_buy(b_budget , 5);
                ess_price=arr[0];
                ess_value=arr[1];
            }
            budget -= ess_price;
        }
        if(budget>0) {
            double arr[] = couples.luxury_buy(budget,3);
            lux_price=arr[0];lux_value=arr[1];
            budget -= lux_price;
        }
        if(budget>0) {
            double arr[] = couples.utility_buy(budget,2);
            util_price=arr[0];util_value=arr[1];
            budget -= util_price;
        }
        couples.girl_happy(ess_price,lux_price,util_price,ess_value,lux_value,util_value);
        couples.boy_happy();
        return budget;
    }
    public double geek_makebasket(double b_budget,couples couples){
        double budget=b_budget;
        double ess_price=0.0,ess_value=0.0;
        double lux_price=0.0,lux_value=0.0;
        double util_price=0.0,util_value=0.0;
        if(budget>0) {
            double arr[] = couples.essential_buy(couples.getMaint_cost(),5);
            ess_price=arr[0];ess_value=arr[1];
            if(ess_price == 0){
                b_budget += 1000;
                arr = couples.essential_buy(b_budget, 5);
                ess_price=arr[0];ess_value=arr[1];
            }
            budget -= ess_price;
        }
        if(budget>0) {
            double arr[] = couples.luxury_buy(budget,3);
            lux_price=arr[0];lux_value=arr[1];
            budget -= lux_price;
        }
        if(budget>0) {
            double arr[] = couples.utility_buy(budget,2);
            util_price=arr[0];util_value=arr[1];
            budget -= util_price;
        }
        couples.girl_happy(ess_price,lux_price,util_price,ess_value,lux_value,util_value);
        couples.boy_happy();
        return budget;
    }
}
class Basket_hybrid extends Filling_Basket{
    public double miser_makebasket(double b_budget,couples couples){
        double budget=b_budget;
        double ess_price=0.0,ess_value=0.0;
        double lux_price=0.0,lux_value=0.0;
        double util_price=0.0,util_value=0.0;
        if(budget>0) {
            double arr[] = couples.essential_buy(couples.getMaint_cost(),3);
            ess_price=arr[0];ess_value=arr[1];
            budget -= ess_price;
            if(ess_price == 0){
                b_budget += 1000;
                arr = couples.essential_buy(b_budget,5);
                ess_price=arr[0];ess_value=arr[1];
            }
            budget -= ess_price;
        }
        double arr[] = couples.luxury_buy(max(budget,5000),5);
        lux_price=arr[0];lux_value=arr[1];
        budget -= lux_price;
        arr = couples.utility_buy(max(5000,budget), 5);
        util_price=arr[0];util_value=arr[1];
        budget -= util_price;
        couples.girl_happy(ess_price,lux_price,util_price,ess_value,lux_value,util_value);
        couples.boy_happy();
        return budget;
    }

    public double generous_makebasket(double b_budget,couples couples){
        double budget=b_budget;
        double ess_price=0.0,ess_value=0.0;
        double lux_price=0.0,lux_value=0.0;
        double util_price=0.0,util_value=0.0;
        if(budget>0) {
            double arr[] = couples.essential_buy(budget,5);
            ess_price=arr[0];
            ess_value=arr[1];
            if(ess_price == 0){
                b_budget +=1000;
                arr = couples.essential_buy(b_budget , 5);
                ess_price=arr[0];
                ess_value=arr[1];
            }
            budget -= ess_price;
        }
        double arr[] = couples.luxury_buy(max(budget,5000),5);
        lux_price=arr[0];lux_value=arr[1];
        budget -= lux_price;
        arr = couples.utility_buy(max(5000,budget), 5);
        util_price=arr[0];util_value=arr[1];
        budget -= util_price;
        couples.girl_happy(ess_price,lux_price,util_price,ess_value,lux_value,util_value);
        couples.boy_happy();
        return budget;
    }
    public double geek_makebasket(double b_budget,couples couples){
        double budget=b_budget;
        double ess_price=0.0,ess_value=0.0;
        double lux_price=0.0,lux_value=0.0;
        double util_price=0.0,util_value=0.0;
        if(budget>0) {
            double arr[] = couples.essential_buy(couples.getMaint_cost(),5);
            ess_price=arr[0];ess_value=arr[1];
            if(ess_price == 0){
                b_budget += 1000;
                arr = couples.essential_buy(b_budget, 5);
                ess_price=arr[0];ess_value=arr[1];
            }
            budget -= ess_price;
        }
        double arr[] = couples.luxury_buy(max(budget,5000),5);
        lux_price=arr[0];lux_value=arr[1];
        budget -= lux_price;
        arr = couples.utility_buy(max(5000,budget), 5);
        util_price=arr[0];util_value=arr[1];
        budget -= util_price;
        couples.girl_happy(ess_price,lux_price,util_price,ess_value,lux_value,util_value);
        couples.boy_happy();
        return budget;
    }
}
public class q8 {
}

