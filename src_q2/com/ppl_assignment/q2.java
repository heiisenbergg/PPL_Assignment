package com.ppl_assignment;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class q2 {

    public q2(ArrayList<couples> couplesArrayList) throws FileNotFoundException {
        for(couples couples:couplesArrayList ){
            System.out.println(couples.getB_budget());
            couples.makeBasket();
            System.out.println(couples.num_ess);
            System.out.println(couples.getB_budget());
        }
        CSVgenerator_Gift csVgenerator_gift = new  CSVgenerator_Gift();
        csVgenerator_gift.generate(couplesArrayList);
    }
}
