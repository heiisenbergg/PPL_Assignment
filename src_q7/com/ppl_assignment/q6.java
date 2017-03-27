package com.ppl_assignment;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class q6 {
    int t=5,i,j,k;
    q4 q4 = new q4();
    int diff = 1 + (int)(Math.random() * 3);
    public void gifting(ArrayList<boy> boyArrayList,
                                      ArrayList<girl> girlArrayList,
                                      ArrayList<couples> couplesArrayList) throws FileNotFoundException {
        couples c;
        CSVgenerator_Gift csVgenerator_gift = new  CSVgenerator_Gift();
        for(i=0;i<t;i++) {
            for (couples couples : couplesArrayList) {
                couples.makeBasket();
            }
            csVgenerator_gift.generate(couplesArrayList,Integer.toString(14+i*diff));
            couplesArrayList = breakup_conditional(couplesArrayList,boyArrayList,girlArrayList,14+i*diff);
        }
    }
    public ArrayList<couples> breakup_conditional(ArrayList<couples> couplesArrayList,
                                      ArrayList<boy> boyArrayList,
                                      ArrayList<girl> girlArrayList,
                                      int happiness_threshold) throws FileNotFoundException {
        ArrayList<couples> after_breakup = new ArrayList<couples>(10);
        ArrayList<couples> breakup = new ArrayList<couples>(40);
        System.out.println("\nBreakup Module for date " + Integer.toString(happiness_threshold));
        Collections.sort(couplesArrayList, new MyCouple_happy_reverse());
        for( couples c : couplesArrayList){
            if(c.getB_happy_lvl() + c.getG_happy_lvl() < 500+10*happiness_threshold) {
                for (boy b : boyArrayList) {
                    if (c.getB_name().equals( b.getBname())) {
                        b.setComm_or_not(false);
                        b.setLast_gf(c.getG_name());
                        break;
                    }
                }
                for (girl g : girlArrayList) {
                    if (c.getG_name().equals(g.getG_name())) {
                        g.setComm_or_not(false);
                        g.setLast_bf(c.getB_name());
                        break;
                    }
                }
            }
            breakup.add(c);
            System.out.println(c.getB_name()+" broke up with "+c.getG_name());
        }
        for( couples couples : breakup) {
            couplesArrayList.remove(couples);
        }
        after_breakup = q1.matchmaking(boyArrayList, girlArrayList);
        new CSVgenerator_Couple().generate(after_breakup,"rematching_"+Integer.toString(happiness_threshold));
        return after_breakup;
    }
}
