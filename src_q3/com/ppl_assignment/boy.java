package com.ppl_assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class boy {

    private String bname;                                 //name of boy
    private double attr_level;                            //level of attractiveness
    private double budget;                               //budget
    private double iq_lvl;                                //intelligence level
    private int c_type;                                    //commitment type
    private double happy_lvl;                                //happiness level
    private double min_attract_req;                          //minimum attraction requirement
    private boolean comm_or_not;

    boy(String name,double attract,double mb,double iq,int type,double min_attract){
        this.bname=name;
        this.attr_level=attract;
        this.budget=mb;
        this.iq_lvl=iq;
        this.c_type=type;                                    // 0 for non-committed, 1 for miser, 2 for generous, 3 for geek
        this.happy_lvl=0;
        this.min_attract_req=min_attract;
        comm_or_not = false;
    }

    public String getBname() {
        return bname;
    }


    public double getAttr_level() {
        return attr_level;
    }

    public double getBudget() {
        return budget;
    }

    public double getIq_lvl() {
        return iq_lvl;
    }

    public int getC_type() {
        return c_type;
    }

    public double getHappy_lvl() {
        return 0;
    }

    public double getMin_attract_req() {
        return min_attract_req;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAttr_level(double attr_level) {
        this.attr_level = attr_level;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setIq_lvl(double iq_lvl) {
        this.iq_lvl = iq_lvl;
    }

    public void setC_type(int c_type) {
        this.c_type = c_type;
    }

    public void setHappy_lvl(double happy_lvl) {
        this.happy_lvl = happy_lvl;
    }

    public void setMin_attract_req(double min_attract_req) {
        this.min_attract_req = min_attract_req;
    }

    public boolean isComm_or_not() {
        return comm_or_not;
    }

    public void setComm_or_not(boolean comm_or_not) {
        this.comm_or_not = comm_or_not;
    }
}
