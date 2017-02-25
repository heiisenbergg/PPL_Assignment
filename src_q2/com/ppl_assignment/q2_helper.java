package com.ppl_assignment;

import java.util.ArrayList;

public class q2_helper {
    ArrayList<e_gifts> e_giftsArrayList = e_gift_rand.generator() ;
    ArrayList<l_gifts> l_giftsArrayList = l_gift_rand.generator() ;
    ArrayList<u_gifts> u_giftsArrayList = u_gift_rand.generator();
    private String b_name;
    private double b_budget;
    private double b_iq;
    private double b_attract_lvl;
    private double b_happy_lvl;

    private String g_name;
    private double g_maint;
    private double g_iq;
    private double g_attract_lvl;
    private double g_happy_lvl;

    q2_helper(boy b, girl g){
        b_name=b.getBname();
        b_budget=b.getBudget();
        b_iq=b.getIq_lvl();
        b_attract_lvl=b.getAttr_level();
        b_happy_lvl=b.getHappy_lvl();

        g_name=g.getG_name();
        g_maint=g.getMaint_cost();
        g_iq=g.getIq();
        g_attract_lvl=g.getAttract_lvl();
        g_happy_lvl=g.getHappy_lvl();
        //if(b.budget>=g.mb && g.attract>=b.min_attract)
    }
    public void makeBasket(boy b,girl g){
        double budget=b.getBudget();
        double ess_price=0.0,ess_value=0.0;
        double lux_price=0.0,lux_value=0.0;
        double util_price=0.0,util_value=0.0;
        int type = b.getC_type();
        switch(type){
            case 1: budget = miser_makebasket(b,g);
                break;
            case 2: budget = generous_makebasket(b,g);
                break;
            case 3: budget = geek_makebasket(b,g);
                break;
        }
        b.setBudget(budget);
        girl_happy(b,g,ess_price,lux_price,util_price,ess_value,lux_value,util_value);
        boy_happy(b,g);
    }
    public double miser_makebasket(boy b,girl g){
        double budget=b.getBudget();
        double ess_price=0.0,ess_value=0.0;
        double lux_price=0.0,lux_value=0.0;
        double util_price=0.0,util_value=0.0;
        if(budget>0) {
            double arr[] = buy_ess(g.getMaint_cost(),3);
            ess_price=arr[0];ess_value=arr[1];
            budget -= ess_price;
            if(ess_price == 0){
                b.setBudget(b.getBudget()+1000);
                budget += 1000;
                arr = buy_ess(budget, 3);
                ess_price=arr[0];ess_value=arr[1];
            }
            budget -= ess_price;
        }
        if(budget>0) {
            double arr[] = buy_lux(budget,3);
            lux_price=arr[0];lux_value=arr[1];
            budget -= lux_price;
        }
        if(budget>0) {
            double arr[] = buy_uti(budget,3);
            util_price=arr[0];util_value=arr[1];
            budget -= util_price;
        }
        return budget;
    }

    public double generous_makebasket(boy b,girl g){
        double budget=b.getBudget();
        double ess_price=0.0,ess_value=0.0;
        double lux_price=0.0,lux_value=0.0;
        double util_price=0.0,util_value=0.0;
        if(budget>0) {
            double arr[] = buy_ess(budget,3);
            ess_price=arr[0];ess_value=arr[1];
            if(ess_price == 0){
                b.setBudget(b.getBudget()+1000);
                budget += 1000;
                arr = buy_ess(budget + 1000, 3);
                ess_price=arr[0];ess_value=arr[1];
            }
            budget -= ess_price;
        }
        if(budget>0) {
            double arr[] = buy_lux(budget,3);
            lux_price=arr[0];lux_value=arr[1];
            budget -= lux_price;
        }
        if(budget>0) {
            double arr[] = buy_uti(budget,3);
            util_price=arr[0];util_value=arr[1];
            budget -= util_price;
        }
        return budget;
    }
    public double geek_makebasket(boy b,girl g){
        double budget=b.getBudget();
        double ess_price=0.0,ess_value=0.0;
        double lux_price=0.0,lux_value=0.0;
        double util_price=0.0,util_value=0.0;
        if(budget>0) {
            double arr[] = buy_ess(g.getMaint_cost(),3);
            ess_price=arr[0];ess_value=arr[1];
            if(ess_price == 0){
                b.setBudget(b.getBudget()+1000);
                budget += 1000;
                arr = buy_ess(budget + 1000, 3);
                ess_price=arr[0];ess_value=arr[1];
            }
            budget -= ess_price;
        }
        if(budget>0) {
            double arr[] = buy_lux(budget,3);
            lux_price=arr[0];lux_value=arr[1];
            budget -= lux_price;
        }
        if(budget>0) {
            double arr[] = buy_uti(budget,3);
            util_price=arr[0];util_value=arr[1];
            budget -= util_price;
        }
        return budget;
    }

    public void girl_happy(boy b,girl g,double ap,double bp,double cp,double av,double bv,double cv){
        switch(g.getC_type()){
            case 1: g.setHappy_lvl(Math.log(ap+2*bp+cp));
                break;
            case 2: g.setHappy_lvl(ap+bp+cp+av+bv+cv);
                break;
            case 3: g.setHappy_lvl(Math.exp(ap+bp+cp));
        }
    }
    public void boy_happy(boy b,girl g){
        switch(b.getC_type()){
            case 1: b.setHappy_lvl(b.getBudget());
                break;
            case 2: b.setHappy_lvl(g.getHappy_lvl());
                break;
            case 3: b.setHappy_lvl(g.getIq());
        }
    }
    public double[] buy_ess(double budget,int max){
        double arr[] = {0, 0};
        int count = 0;
        for ( e_gifts e : e_giftsArrayList ) {
            double ess_price = e.getPrice();
            count++;
            double ess_value = e.getPrice();
            if (budget - ess_price >= 0) {
                arr[0] += ess_price;
                arr[1] += ess_value;
                budget -= ess_price;
            }
            if(count == max)
                break;
        }
        return arr;
    }
    public double[] buy_lux(double budget,int max){
        double arr[] = {0, 0};
        for ( l_gifts l : l_giftsArrayList ) {
            double lprice = l.getPrice();
            double lvalue = l.getPrice();

            if (budget - lprice >= 0) {
                arr[0] = lprice;
                arr[1] = lvalue;
            }
        }
        return arr;
    }
    public double[] buy_uti(double budget,int max) {
        double arr[] = {0, 0};
        for (u_gifts u : u_giftsArrayList) {
            double uprice = u.getPrice();
            double uvalue = u.getPrice();
            if (budget - uprice >= 0) {
                arr[0] = uprice;
                arr[1] = uvalue;
            }
        }
            return arr;
    }
    public double compat(){
        return (Math.abs(b_budget-g_maint)+Math.abs(b_iq-g_iq)+Math.abs(b_attract_lvl-g_attract_lvl));
    }
    public double happiness_couple(){
        return (b_happy_lvl + g_happy_lvl);
    }
}