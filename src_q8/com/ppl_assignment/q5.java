package com.ppl_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class q5 {
    public ArrayList<couples> matching_algo (ArrayList<boy> boyArrayList,ArrayList<girl> girlArrayList) {
        ArrayList<couples> couplesArrayList = new ArrayList<couples>(10);
        int boy_size= boyArrayList.size();
        int girl_size = girlArrayList.size();
        int size = boyArrayList.size() + girlArrayList.size() - 1;
        int i,j,bptr=0,gptr=0;
        boy b;
        girl g;
        Collections.sort(boyArrayList, new boy_attractiveness());
        Collections.sort(girlArrayList, new girl_maint_cost());
        for(i=0;i<size;i++){
            if(i%2 != 0 && bptr<boy_size) {
                b = boyArrayList.get(bptr++);
                for(j=0;j<girl_size;j++){
                    g = girlArrayList.get(j);
                    if (b.getBudget() >= g.getMaint_cost()
                            && g.getAttract_lvl() >= b.getMin_attract_req()
                            && b.isComm_or_not() == false
                            && g.isComm_or_not() == false
                            && !g.getG_name().equals(b.getLast_gf())
                            && !b.getBname().equals(g.getLast_bf())) {
                        b.setComm_or_not(true);
                        g.setComm_or_not(true);
                        couples couples = new couples();
                        couples.setting(b, g);
                        couplesArrayList.add(couples);
                    }
                }
            } else if ( i%2 == 0 && gptr < girl_size){
                g = girlArrayList.get(gptr++);
                for(j=0;j<boy_size;j++){
                    b = boyArrayList.get(j);
                    if (b.getBudget() >= g.getMaint_cost()
                            && g.getAttract_lvl() > b.getMin_attract_req()
                            && b.isComm_or_not() == false
                            && g.isComm_or_not() == false
                            && !g.getG_name().equals(b.getLast_gf())
                            && !b.getBname().equals(g.getLast_bf())) {
                        b.setComm_or_not(true);
                        g.setComm_or_not(true);
                        couples couples = new couples();
                        couples.setting(b, g);
                        couplesArrayList.add(couples);
                    }
                }
            }
        }
        return couplesArrayList;
    }
}
class boy_attractiveness implements Comparator<boy> {
    public int compare(boy u1, boy u2) {
       /* if (u1.getAttr_level() > u2.getAttr_level() ) {
            return 1;
        } else {
            return -1;
        }*/
       return Double.compare(u1.getAttr_level(),u2.getAttr_level());
    }
}

class girl_maint_cost implements Comparator<girl> {
    public int compare(girl u1, girl u2) {
       /* if ( u1.getMaint_cost() > u2.getMaint_cost() ) {
            return 1;
        } else {
            return -1;
        }*/
        return Double.compare(u1.getMaint_cost(),u2.getMaint_cost());
    }
}