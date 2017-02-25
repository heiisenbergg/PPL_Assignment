package com.ppl_assignment;

import java.util.ArrayList;

public class l_gift_rand {
    private static double price,value,l_rate,diff;
    public static ArrayList<l_gifts> generator(){
        ArrayList<l_gifts> l_giftsArrayList = new ArrayList<>(10);
        int i;

        for(i=0;i<10;i++){
            price = 100 + (int)(Math.random() * 1000);
            value = 100 + (int)(Math.random() * 1000);
            l_rate = 100 + (int)(Math.random() * 1000);
            diff = 100 + (int)(Math.random() * 1000);
            l_gifts l = new l_gifts(price,value,l_rate,diff);
            l_giftsArrayList.add(l);
        }
        return l_giftsArrayList;
    }
}
