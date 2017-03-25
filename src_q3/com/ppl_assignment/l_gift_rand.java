package com.ppl_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class l_gift_rand {
    private static double price,value,l_rate,diff;
    public static ArrayList<gift> generator(){
        ArrayList<gift> l_giftsArrayList = new ArrayList<gift>(10);
        int i;

        for(i=0;i<10;i++){
            price = 100 + (int)(Math.random() * 1000);
            value = 100 + (int)(Math.random() * 1000);
            l_rate = 100 + (int)(Math.random() * 1000);
            diff = 100 + (int)(Math.random() * 1000);
            gift l = new l_gifts(price,value,l_rate,diff);
            l_giftsArrayList.add(l);
        }
        Collections.sort(l_giftsArrayList, new MyPriceComp_Ess());
        return l_giftsArrayList;
    }
}
/*class MyPriceComp_lux implements Comparator<l_gifts> {
    public int compare(l_gifts l1, l_gifts l2) {
        if (l1.getPrice() > l2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}*/
