package com.ppl_assignment;

import java.util.ArrayList;

public class couples {

    private String b_name;
    private String g_name;
    private double b_attr_level;
    private double g_attr_level;
    private double b_budget;
    private double maint_cost;
    private double b_iq_lvl;
    private double g_iq_lvl;
    private double b_happy_lvl;
    private double g_happy_lvl;
    protected int num_ess,num_lux,num_util;
    protected double price_ess,price_lux,price_util;
    public int getBoy_c_type() {
        return boy_c_type;
    }

    public void setBoy_c_type(int boy_c_type) {
        this.boy_c_type = boy_c_type;
    }

    public int getGirl_c_type() {
        return girl_c_type;
    }

    public void setGirl_c_type(int girl_c_type) {
        this.girl_c_type = girl_c_type;
    }

    private int boy_c_type,girl_c_type;

    public double getGirl_maint() {
        return girl_maint;
    }

    public void setGirl_maint(double girl_maint) {
        this.girl_maint = girl_maint;
    }

    private double girl_maint;

    public void setting(boy b,girl g){
        b_name = b.getBname();
        g_name = g.getG_name();
        b_attr_level = b.getAttr_level();
        g_attr_level = g.getAttract_lvl();
        b_budget = b.getBudget();
        maint_cost = g.getMaint_cost();
        b_iq_lvl = b.getIq_lvl();
        g_iq_lvl = g.getIq();
        b_happy_lvl = b.getHappy_lvl();
        g_happy_lvl = g.getHappy_lvl();
        boy_c_type = b.getC_type();
        girl_c_type = g.getC_type();
        girl_maint = g.getMaint_cost();
        num_ess = num_lux = num_ess = 0;
        price_ess = price_lux = price_ess = 0.0;
    }
    ArrayList<e_gifts> e_giftsArrayList = e_gift_rand.generator() ;
    ArrayList<l_gifts> l_giftsArrayList = l_gift_rand.generator() ;
    ArrayList<u_gifts> u_giftsArrayList = u_gift_rand.generator();

    public void makeBasket(){
        int type = (int)boy_c_type;
        double budget=0.0;
        switch(type){
            case 1: budget = miser_makebasket();
                break;
            case 2: budget = generous_makebasket();
                break;
            case 3: budget = geek_makebasket();
                break;
        }
        b_budget = budget;

    }
    public double miser_makebasket(){
        double budget=b_budget;
        double ess_price=0.0,ess_value=0.0;
        double lux_price=0.0,lux_value=0.0;
        double util_price=0.0,util_value=0.0;
        if(budget>0) {
            double arr[] = essential_buy(maint_cost,3);
            ess_price=arr[0];ess_value=arr[1];
            budget -= ess_price;
            if(ess_price == 0){
                b_budget += 1000;
                arr = essential_buy(b_budget, 3);
                ess_price=arr[0];ess_value=arr[1];
            }
            budget -= ess_price;
        }
        if(budget>0) {
            double arr[] = luxury_buy(budget,3);
            lux_price=arr[0];lux_value=arr[1];
            budget -= lux_price;
        }
        if(budget>0) {
            double arr[] = utility_buy(budget,3);
            util_price=arr[0];util_value=arr[1];
            budget -= util_price;
        }
        girl_happy(ess_price,lux_price,util_price,ess_value,lux_value,util_value);
        boy_happy();
        return budget;
    }

    public double generous_makebasket(){
        double budget=b_budget;
        double ess_price=0.0,ess_value=0.0;
        double lux_price=0.0,lux_value=0.0;
        double util_price=0.0,util_value=0.0;
        if(budget>0) {
            double arr[] = essential_buy(budget,3);
            ess_price=arr[0];
            ess_value=arr[1];
            if(ess_price == 0){
                b_budget +=1000;
                arr = essential_buy(b_budget , 3);
                ess_price=arr[0];
                ess_value=arr[1];
            }
            budget -= ess_price;
        }
        if(budget>0) {
            double arr[] = luxury_buy(budget,3);
            lux_price=arr[0];lux_value=arr[1];
            budget -= lux_price;
        }
        if(budget>0) {
            double arr[] = utility_buy(budget,3);
            util_price=arr[0];util_value=arr[1];
            budget -= util_price;
        }
        girl_happy(ess_price,lux_price,util_price,ess_value,lux_value,util_value);
        boy_happy();
        return budget;
    }
    public double geek_makebasket(){
        double budget=b_budget;
        double ess_price=0.0,ess_value=0.0;
        double lux_price=0.0,lux_value=0.0;
        double util_price=0.0,util_value=0.0;
        if(budget>0) {
            double arr[] = essential_buy(maint_cost,3);
            ess_price=arr[0];ess_value=arr[1];
            if(ess_price == 0){
                b_budget += 1000;
                arr = essential_buy(b_budget, 3);
                ess_price=arr[0];ess_value=arr[1];
            }
            budget -= ess_price;
        }
        if(budget>0) {
            double arr[] = luxury_buy(budget,3);
            lux_price=arr[0];lux_value=arr[1];
            budget -= lux_price;
        }
        if(budget>0) {
            double arr[] = utility_buy(budget,3);
            util_price=arr[0];util_value=arr[1];
            budget -= util_price;
        }
        girl_happy(ess_price,lux_price,util_price,ess_value,lux_value,util_value);
        boy_happy();
        return budget;
    }

    public void girl_happy(double ess_price,double lux_price,double util_price,
                           double ess_value,double lux_value,double util_value){
        switch((int)girl_c_type){
            case 1: g_happy_lvl = Math.log(ess_price+2*lux_price+util_price);
                break;
            case 2: g_happy_lvl = ess_price+lux_price+util_price+ess_value+lux_value+util_value;
                break;
            case 3: g_happy_lvl =(Math.exp(ess_price+lux_price+util_price));
        }
        if(g_happy_lvl >= 500){
            g_happy_lvl = 500;
        }
        //System.out.println(g_happy_lvl);
    }
    public void boy_happy(){
        switch((int)boy_c_type){
            case 1: b_happy_lvl = (b_budget);
                break;
            case 2: b_happy_lvl = (g_happy_lvl);
                break;
            case 3: b_happy_lvl = g_iq_lvl;
        }
    }
    public double[] essential_buy(double budget,int max){
        double arr[] = {0, 0};
        int count = 0;
        for ( e_gifts e : e_giftsArrayList ) {
            double ess_price = e.getPrice();
            count++;
            num_ess++;
            double ess_value = e.getPrice();
            if (budget - ess_price >= 0) {
                arr[0] += ess_price;
                arr[1] += ess_value;
                budget -= ess_price;
                budget -= ess_price;
            } else break;
            if(count == max)
                break;
        }
        num_ess = count;
        price_ess = arr[0];
        return arr;
    }
    public double[] luxury_buy(double budget,int max){
        double arr[] = {0, 0};
        int count = 0;
        for ( l_gifts l : l_giftsArrayList ) {
            count++;
            num_lux++;
            double price = l.getPrice();
            double value = l.getPrice();
            if (budget - price >= 0) {
                arr[0] += price;
                arr[1] += value;
                budget -= price;
            }
            else
                 break;
            if(count == max)
                break;
        }
        //num_lux = count;
        price_lux = arr[0];
        return arr;
    }
    public double[] utility_buy(double budget,int max) {
        double arr[] = {0, 0};
        int count = 0;
        for (u_gifts u : u_giftsArrayList) {
            count++;
            double price = u.getPrice();
            double value = u.getPrice();
            if (budget - price >= 0) {
                arr[0] += price;
                arr[1] += value;
                budget -= price;
            } else  break;
            if(count == max)
                break;
        }
        num_util = count;
        price_util = arr[0];
        return arr;
    }
    public double compat(){
        return (Math.abs(b_budget-maint_cost)+Math.abs(b_iq_lvl-g_iq_lvl)+Math.abs(b_attr_level-g_attr_level));
    }
    public double happiness_couple(){
        return (b_happy_lvl + g_happy_lvl);
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public double getB_attr_level() {
        return b_attr_level;
    }

    public void setB_attr_level(double b_attr_level) {
        this.b_attr_level = b_attr_level;
    }

    public double getG_attr_level() {
        return g_attr_level;
    }

    public void setG_attr_level(double g_attr_level) {
        this.g_attr_level = g_attr_level;
    }

    public double getB_budget() {
        return b_budget;
    }

    public void setB_budget(double b_budget) {
        this.b_budget = b_budget;
    }

    public double getMaint_cost() {
        return maint_cost;
    }

    public void setMaint_cost(double maint_cost) {
        this.maint_cost = maint_cost;
    }

    public double getB_iq_lvl() {
        return b_iq_lvl;
    }

    public void setB_iq_lvl(double b_iq_lvl) {
        this.b_iq_lvl = b_iq_lvl;
    }

    public double getG_iq_lvl() {
        return g_iq_lvl;
    }

    public void setG_iq_lvl(double g_iq_lvl) {
        this.g_iq_lvl = g_iq_lvl;
    }

    public double getB_happy_lvl() {
        return b_happy_lvl;
    }

    public void setB_happy_lvl(double b_happy_lvl) {
        this.b_happy_lvl = b_happy_lvl;
    }

    public double getG_happy_lvl() {
        return g_happy_lvl;
    }

    public void setG_happy_lvl(double g_happy_lvl) {
        this.g_happy_lvl = g_happy_lvl;
    }
}
