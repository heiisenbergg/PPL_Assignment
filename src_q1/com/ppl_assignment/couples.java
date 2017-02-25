package com.ppl_assignment;

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

    public double getBoy_c_type() {
        return boy_c_type;
    }

    public void setBoy_c_type(double boy_c_type) {
        this.boy_c_type = boy_c_type;
    }

    public double getGirl_c_type() {
        return girl_c_type;
    }

    public void setGirl_c_type(double girl_c_type) {
        this.girl_c_type = girl_c_type;
    }

    private double boy_c_type,girl_c_type;

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
    }
    public double compatibility(){
        return Math.abs(b_budget - maint_cost) + Math.abs(b_iq_lvl - g_iq_lvl) + Math.abs(b_attr_level - g_attr_level) ;
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
