package com.ppl_assignment;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class q1 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<boy> boyArrayList = new ArrayList<boy>(60);
        ArrayList<girl> girlArrayList = new ArrayList<girl>(40);
        ArrayList<couples> couplesArrayList = new ArrayList<>(40);
        CSVgenerator_Boy csVgeneratorBoy = new CSVgenerator_Boy();
        CSVgenerator_Girl csVgeneratorgirl = new CSVgenerator_Girl();
        boyArrayList = csVgeneratorBoy.generate();
        girlArrayList = csVgeneratorgirl.generate();
        for (boy b : boyArrayList){
            for(girl g: girlArrayList){
                if(b.getBudget() >= g.getMaint_cost()
                        && g.getAttract_lvl() > b.getMin_attract_req() && b.isComm_or_not() == false
                        && g.isComm_or_not() == false ){
                    b.setComm_or_not(true);
                    g.setComm_or_not(true);
                    couples couples = new couples();
                    couples.setting(b,g);
                    couplesArrayList.add(couples);
                }
            }
        }
        CSVgenerator_Couple csVgeneratorCouple = new CSVgenerator_Couple();
        csVgeneratorCouple.generate(couplesArrayList);
    }
}
