package com.ppl_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class e_gift_rand{
    private static double price,value;
    public static ArrayList<gift> generator(){
        ArrayList<gift> e_giftsArrayList = new ArrayList<gift>(10);
        int i;
        for(i=0;i<10;i++){
            price = 100 + (int)(Math.random() * 1000);
            value = 100 + (int)(Math.random() * 1000);
            gift e = new e_gifts(price,value);
            e_giftsArrayList.add(e);
        }
        Collections.sort(e_giftsArrayList, new MyPriceComp_Ess());
        //System.out.println("Size of Essential Gift ArrayList " + e_giftsArrayList.size());
//        for(e_gifts e:e_giftsArrayList){
//            System.out.println((int)e.getPrice());
//        }
//        System.out.println();
        return e_giftsArrayList;
    }

}

class MyPriceComp_Ess implements Comparator<gift> {
    public int compare(gift e1,gift e2) {
        if (e1.getPrice() > e2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}
