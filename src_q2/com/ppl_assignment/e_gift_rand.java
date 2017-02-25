package com.ppl_assignment;

import java.util.ArrayList;

public class e_gift_rand {
    private static double price,value;
    public static ArrayList<e_gifts> generator(){
        ArrayList<e_gifts> e_giftsArrayList = new ArrayList<>(10);
        int i;

        for(i=0;i<10;i++){
            price = 100 + (int)(Math.random() * 1000);
            value = 100 + (int)(Math.random() * 1000);
            e_gifts e = new e_gifts(price,value);
            e_giftsArrayList.add(e);
        }
        return e_giftsArrayList;
    }
}
