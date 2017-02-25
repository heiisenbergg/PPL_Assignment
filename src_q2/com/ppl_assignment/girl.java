
package com.ppl_assignment;

public class girl {
    private String g_name;                             //name of girl
    private double attract_lvl;                          //level of attractiveness
    private double maint_cost;                               //maintainer cost
    private double iq;                               //level of intelligencee
    private int c_type;                                 //commitment type
    private double happy_lvl;                            //happiness level
    private boolean comm_or_not;

    girl(String name,double attract,double mb,double iq,int type){
        this.g_name=name;
        this.attract_lvl=attract;
        this.maint_cost=mb;
        this.iq=iq;
        this.c_type=type;                                // 0 for non-committed, 1 for choosy, 2 for normal, 3 for desperate
         this.happy_lvl=0;
         comm_or_not = false;
    }
    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public double getAttract_lvl() {
        return attract_lvl;
    }

    public void setAttract_lvl(double attract_lvl) {
        this.attract_lvl = attract_lvl;
    }

    public double getMaint_cost() {
        return maint_cost;
    }

    public void setMaint_cost(double maint_cost) {
        this.maint_cost = maint_cost;
    }

    public double getIq() {
        return iq;
    }

    public void setIq(double iq) {
        this.iq = iq;
    }

    public int getC_type() {
        return c_type;
    }

    public void setC_type(int c_type) {
        this.c_type = c_type;
    }

    public double getHappy_lvl() {
        return happy_lvl;
    }

    public void setHappy_lvl(double happy_lvl) {
        this.happy_lvl = happy_lvl;
    }
    public boolean isComm_or_not() {
        return comm_or_not;
    }

    public void setComm_or_not(boolean comm_or_not) {
        this.comm_or_not = comm_or_not;
    }


}
