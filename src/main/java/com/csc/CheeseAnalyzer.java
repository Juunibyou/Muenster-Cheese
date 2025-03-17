package com.csc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class CheeseAnalyzer {
    // Method to read the cvs file
    public static List<Cheese> readCheeseData(String fileName) throws IOException {
        List<Cheese> cheeses = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        br.readLine();  // Skip the header line
    
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            if (values.length < 10) continue;  // Skip malformed rows
    
            String MilkType = values[8];
            String MilkTreatment = values[9];
            
            double Moisture = 0.0;
            // Check if the moisture value is not empty and can be parsed
            if (!values[3].isEmpty()) {
                try {
                    Moisture = Double.parseDouble(values[3]);
                } catch (NumberFormatException e) {
                    // Log the error or handle it as needed, skipping the row for now
                    System.err.println("Skipping row with invalid moisture value: " + line);
                    continue;  // Skip this row if moisture is invalid
                }
            }
    
            boolean Organic = values[6].equals("1");
    
            cheeses.add(new Cheese(MilkTreatment, Organic, Moisture, MilkType));
        }
    
        br.close();
        return cheeses;
    }
}