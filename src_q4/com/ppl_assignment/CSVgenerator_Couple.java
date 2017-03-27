package com.ppl_assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InterruptedIOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CSVgenerator_Couple {

    public void generate(ArrayList<couples> arrayListcouples,String type) throws FileNotFoundException {
        String path = "Couple_"+type+".csv";
        PrintWriter pw = new PrintWriter(new File(path));
        StringBuilder sb = new StringBuilder();
        sb.append("Boy_Name");
        sb.append(',');
        sb.append("Boy_Attraction");
        sb.append(',');
        sb.append("Boy_Budget");
        sb.append(',');
        sb.append("Boy_IQ");
        sb.append(',');
        sb.append("Boy_Commited_or_not");
        sb.append(',');
        sb.append("Boy_Type");
        sb.append(',');
        sb.append("Boy_Happiness");
        sb.append(',');
        sb.append("Girl_Name");
        sb.append(',');
        sb.append("Girl_Attraction");
        sb.append(',');
        sb.append("Girl_Maintenece");
        sb.append(',');
        sb.append("Girl_IQ");
        sb.append(',');
        sb.append("Girl_Commited_or_not");
        sb.append(',');
        sb.append("Girl_Type");
        sb.append(',');
        sb.append("Girl_Happiness");
        sb.append('\n');

        for (couples couples : arrayListcouples) {
            sb.append(couples.getB_name());
            sb.append(',');
            sb.append(couples.getB_attr_level());
            sb.append(',');
            sb.append(couples.getB_budget());
            sb.append(',');
            sb.append(couples.getB_iq_lvl());
            sb.append(',');
            sb.append("TRUE");
            sb.append(',');
            sb.append(couples.getBoy_c_type());
            sb.append(',');
            sb.append(couples.getB_happy_lvl());
            sb.append(',');
            sb.append(couples.getG_name());
            sb.append(',');
            sb.append(couples.getG_attr_level());
            sb.append(',');
            sb.append(couples.getGirl_maint());
            sb.append(',');
            sb.append(couples.getG_iq_lvl());
            sb.append(',');
            sb.append("TRUE");
            sb.append(',');
            sb.append(couples.getGirl_c_type());
            sb.append(',');
            sb.append(couples.getG_happy_lvl());
            sb.append(',');
            sb.append('\n');
        }
        System.out.println("Size of Couple ArrayList " + arrayListcouples.size());
        pw.write(sb.toString());
        pw.close();
        System.out.println("Couple.csv Done!");
    }
}

