package com.ppl_assignment;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class q1 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<boy> boyArrayList = new ArrayList<boy>(60);
        ArrayList<girl> girlArrayList = new ArrayList<girl>(40);
        CSVgenerator_Boy csVgeneratorBoy = new CSVgenerator_Boy();
        CSVgenerator_Girl csVgeneratorgirl = new CSVgenerator_Girl();
        boyArrayList = csVgeneratorBoy.generate();
        girlArrayList = csVgeneratorgirl.generate();
        ArrayList<couples> couplesArrayList = new ArrayList<couples>(40);
        couplesArrayList = matchmaking(boyArrayList,girlArrayList);
        CSVgenerator_Couple csVgeneratorCouple = new CSVgenerator_Couple();
        csVgeneratorCouple.generate(couplesArrayList,"inital");
        q2 q = new q2(couplesArrayList);
        q4 q4 = new q4();
        couplesArrayList = q4.breakup(couplesArrayList,boyArrayList,girlArrayList);
        csVgeneratorCouple.generate(couplesArrayList,"after_breakup");
        System.out.println("Please Refer to CSV files for Output. ThankYou");
    }
    public static ArrayList<couples> matchmaking(ArrayList<boy> boyArrayList, ArrayList<girl> girlArrayList) {
        ArrayList<couples> couplesArrayList = new ArrayList<couples>(40);
        for (boy b : boyArrayList) {
            for (girl g : girlArrayList) {
                if (b.getBudget() >= g.getMaint_cost()
                        && g.getAttract_lvl() > b.getMin_attract_req() && b.isComm_or_not() == false
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
        return couplesArrayList;
    }
}
