package com.ppl_assignment;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class q2 {

    public q2(ArrayList<couples> couplesArrayList) throws FileNotFoundException {
        for(couples couples:couplesArrayList ){
            couples.makeBasket();

        }
        CSVgenerator_Gift csVgenerator_gift = new  CSVgenerator_Gift();
        csVgenerator_gift.generate(couplesArrayList);
    }
}
