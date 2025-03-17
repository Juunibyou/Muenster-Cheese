package com.csc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        List<Cheese> cheeses = CheeseAnalyzer.readCheeseData("cheese_data.csv");

        //Count Pasteurized and Raw Milk
        int numpasteurized = CheeseStatistics.countmilktreatment(cheeses, "Pasteurized");
        int numrawmilk = CheeseStatistics.countmilktreatment(cheeses, "Raw Milk");

        //Count Organic cheese with moisture above 41.0
        int numorganic = CheeseStatistics.countorganic(cheeses);

        //Count the most common animal that are milked
        String numanimal = CheeseStatistics.countanimal(cheeses);

        //Output
        String output = "Pasteurized Milk: " + numpasteurized + "\n" +
                        "Raw Milk: " + numrawmilk + "\n" +
                        "Organic cheeses with moisture: " + numorganic + "\n" +
                        "Most Common milk type: " + numanimal + "\n";

        //writing into the "Output" file
        try(FileOutputStream outputStream = new FileOutputStream("output.txt")){
            byte[] strToBytes = output.getBytes();
            outputStream.write(strToBytes);
        }

    }
}