package com.ppl_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class u_gift_rand {
    private static double price,value,u_value,u_class;
    public static ArrayList<gift> generator(){
        ArrayList<gift> u_giftsArrayList = new ArrayList<gift>(10);
        int i;

        for(i=0;i<10;i++){
            price = 100 + (int)(Math.random() * 1000);
            value = 100 + (int)(Math.random() * 1000);
            u_value = 100 + (int)(Math.random() * 1000);
            u_class = 100 + (int)(Math.random() * 1000);
            gift u = new u_gifts(price,value,u_value,u_class);
            u_giftsArrayList.add(u);
        }
        Collections.sort(u_giftsArrayList, new MyPriceComp_Ess());
        return u_giftsArrayList;
    }
}
/*class MyPriceComp_util implements Comparator<u_gifts> {
    public int compare(u_gifts u1, u_gifts u2) {
        if (u1.getPrice() > u2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}*/

