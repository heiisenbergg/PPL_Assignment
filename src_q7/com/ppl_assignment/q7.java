package com.ppl_assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static oracle.jrockit.jfr.events.Bits.length;

class find_gf_Arraylist{
    protected ArrayList<couples> couplesArrayList;
    find_gf_Arraylist(ArrayList<couples> couplesArrayList){
        this.couplesArrayList = (ArrayList<couples>)couplesArrayList.clone();
    }
    public void generate(){

    }
    public void search(ArrayList<boy> boyArrayList) {
        int flag = 0;
        System.out.println("Arraylist Method: "+boyArrayList.size());
        for (boy b : boyArrayList) {
            flag = 0;
            for (couples c : couplesArrayList) {
                if (c.getB_name().equals(b.getBname())) {
                    flag = 1;
                    System.out.println(b.getBname() + " coupled with " + c.getG_name());
                    break;
                }
            }
            if( flag == 0){
                System.out.println("Sorry "+b.getBname()+" not commited");
            }
        }
    }
}
class find_gf_Array extends find_gf_Arraylist {
    private String[] boys = new String[500];
    find_gf_Array(ArrayList<couples> couplesArrayList){
        super(couplesArrayList);
    }
    int i=0;
    public void generate(){
        for(couples c: couplesArrayList){
            boys[i++] = c.getB_name();
        }
        //Arrays.sort(boys);
    }
    public void search(ArrayList<boy> boyArrayList){
        System.out.println("Array Method: "+boyArrayList.size());
        for(boy b: boyArrayList){
            for(i=0;i<couplesArrayList.size();i++){
                if(b.getBname().equals(boys[i])){
                    break;
                }
            }
            if( i < couplesArrayList.size()) {
                for (couples c : couplesArrayList) {
                    if (c.getB_name().equals(b.getBname())) {
                        System.out.println(b.getBname() + " coupled with " + c.getG_name());
                        break;
                    }
                }

            } else {
                System.out.println("Sorry "+b.getBname()+" not commited");
            }
        }
    }
}

class find_gf_hash extends find_gf_Arraylist{
    private int[] boys = new int[couplesArrayList.size()];
    int i=0,current;
    find_gf_hash(ArrayList<couples> couplesArrayList){
        super(couplesArrayList);
    }
    public void generate() {
        for (couples c : couplesArrayList) {
            //System.out.println(c.getB_name().substring(4,c.getB_name().length()));
            boys[i++] = Integer.parseInt(c.getB_name().substring(4,c.getB_name().length()));
        }
    }
    public void search(ArrayList<boy> boyArrayList){
        System.out.println("Hash Method: ");
        for(boy b: boyArrayList){
            current = Integer.parseInt(b.getBname().substring(4, b.getBname().length()));
            for(i=0;i<couplesArrayList.size();i++){
                if (boys[i] == current) {
                    break;
                }
            }
            if( i < couplesArrayList.size()) {
                for (couples c : couplesArrayList) {
                    if (c.getB_name().equals(b.getBname())) {
                        System.out.println(b.getBname() + " coupled with " + c.getG_name());
                        break;
                    }
                }

            }else{
                System.out.println("Sorry "+b.getBname()+" not commited");
            }
        }
    }
}
public class q7 {
     public void find_gf(ArrayList<couples> couplesArrayList,ArrayList<boy> boyArrayList){
        find_gf_Arraylist find_gf_arraylist = new find_gf_Arraylist(couplesArrayList);
        find_gf_Arraylist find_gf_array = new find_gf_Array(couplesArrayList);
        find_gf_Arraylist find_gf_hash = new find_gf_hash(couplesArrayList);
         System.out.println("");

        find_gf_arraylist.generate();
        find_gf_arraylist.search(boyArrayList);
         System.out.println("");

        find_gf_array.generate();
        find_gf_array.search(boyArrayList);
         System.out.println("");

        find_gf_hash.generate();
        find_gf_hash.search(boyArrayList);
     }
}
