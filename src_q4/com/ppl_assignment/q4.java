package com.ppl_assignment;

import com.sun.prism.shader.Solid_ImagePattern_Loader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*BreakUp Module*/
public class q4 {
    public ArrayList<couples> breakup(ArrayList<couples> couplesArrayList,
                                      ArrayList<boy> boyArrayList,
                                      ArrayList<girl> girlArrayList) throws FileNotFoundException {
          int k = 7;
          int cnt=0;
          ArrayList<couples> after_breakup = new ArrayList<couples>(10);
         ArrayList<couples> breakup = new ArrayList<couples>(40);
         System.out.println("\nBreakup Module");
         Collections.sort(couplesArrayList, new MyCouple_happy_reverse());
          for( couples c : couplesArrayList){
              cnt++;
              for( boy b: boyArrayList){
                  if(c.getB_name() == b.getBname()){
                      b.setComm_or_not(false);
                      b.setLast_gf(c.getG_name());
                      break;
                  }
              }
              for(girl g: girlArrayList){
                  if(c.getG_name() == g.getG_name()){
                      g.setComm_or_not(false);
                      g.setLast_bf(c.getB_name());
                      break;
                  }
              }
              breakup.add(c);
              System.out.println(c.getB_name()+" broke up with "+c.getG_name());
              if(cnt == k)
                   break;
          }
          for( couples couples : breakup) {
              couplesArrayList.remove(couples);
          }
          after_breakup = q1.matchmaking(boyArrayList,girlArrayList);
          new CSVgenerator_Couple().generate(after_breakup,"rematching");
         return couplesArrayList;
    }
}
class MyCouple_happy_reverse implements Comparator<couples> {
    public int compare(couples u1, couples u2) {
        if (u1.happiness_couple() > u2.happiness_couple()) {
            return 1;
        } else {
            return -1;
        }
    }
}