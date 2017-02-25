package com.ppl_assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CSVgenerator_Girl {
    private String bname;                                 //name of boy
    private double attr_level;                            //level of attractiveness
    private double budget;                               //budget
    private double iq_lvl;                                //intelligence level
    private int c_type;                                    //commitment type
    private double happy_lvl;                                //happiness level
    private double min_attract_req;                          //minimum attraction requirement
    private boolean comm_or_not;

    public ArrayList<girl> generate() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("Girl.csv"));
        ArrayList<girl> girlArrayList = new ArrayList<girl>(40);
        StringBuilder sb = new StringBuilder();
        sb.append("Name");
        sb.append(',');
        sb.append("Attraction");
        sb.append(',');
        sb.append("Maintenance");
        sb.append(',');
        sb.append("IQ");
        sb.append(',');
        sb.append("Commited_or_not");
        sb.append(',');
        sb.append("Type");
        sb.append(',');
        sb.append("Happiness");
        sb.append('\n');

        int i,randomNum_girls,min_girls=10,max_girls=50;
        randomNum_girls = min_girls + (int)(Math.random() * max_girls);
        System.out.println("No. of boys :"+randomNum_girls);
        for(i=0;i<randomNum_girls;i++) {
            bname = "Girl_"+(i+1);
            attr_level = 1 + (int)(Math.random() * 50);
            budget = 1000 + (int)(Math.random() * 4000);
            iq_lvl = 20 + (int)(Math.random() * 130);
            comm_or_not = false;
            c_type = 1 + (int)(Math.random() * 3);
            happy_lvl = 0;
            sb.append("Girl_"+(i+1));
            sb.append(',');
            sb.append(attr_level);
            sb.append(',');
            sb.append(budget);
            sb.append(',');
            sb.append(iq_lvl);
            sb.append(',');
            sb.append(comm_or_not);
            sb.append(',');
            sb.append(c_type);
            sb.append(',');
            sb.append(happy_lvl);
            sb.append('\n');
            girl b = new girl(bname,attr_level,budget,iq_lvl,c_type);
            girlArrayList.add(b);
        }

        System.out.println("Size of Girl ArrayList" + girlArrayList.size());
        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
        pw.write(sb.toString());
        pw.close();
        System.out.println("Girl.csv Done!");
        return girlArrayList;
    }
}
