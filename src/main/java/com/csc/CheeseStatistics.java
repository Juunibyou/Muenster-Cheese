package com.csc;

import java.util.List;

public class CheeseStatistics {
    //Method to count cheese based on milktreatment
    static int countmilktreatment(List<Cheese> ch, String mk){
        int count = 0;
        for(Cheese cheese : ch){
            if(cheese.getmilktreatment().equalsIgnoreCase(mk)){
                count++;
            }
        }
        return count;
    }

    //Method to count cheese based on organic and moisture
    static int countorganic(List<Cheese> ch){
        int count = 0;
        for(Cheese cheese : ch){
            if(cheese.getorganic() && cheese.getmoisture() > 41.0){
                count++;
            }
        }
        return count;
    }

    //Method for the milk type (cow, goat, ewe, buffalo)
    static String countanimal(List<Cheese> ch){
        int cow = 0;
        int goat = 0;
        int ewe = 0;
        int buffalo = 0;

        for(Cheese cheese : ch){
            String MilkType = cheese.getmilktype();

            if(MilkType.equalsIgnoreCase("Cow")){
                cow++;
            }
            else if(MilkType.equalsIgnoreCase("Goat")){
                goat++;
            }
            else if(MilkType.equalsIgnoreCase("Ewe")){
                ewe++;
            }
            else if(MilkType.equalsIgnoreCase("Buffalo")){
                buffalo++;
            }
        }

        if(cow >= goat && cow >= ewe && cow >= buffalo){
            return "Cow";
        }
        else if(goat >= cow && goat >= ewe && goat >= buffalo){
            return "Goat";
        }
        else if(ewe >= goat && ewe >= cow && ewe >= buffalo){
            return "Ewe";
        }
        else{return "Buffalo";}
    }
}
