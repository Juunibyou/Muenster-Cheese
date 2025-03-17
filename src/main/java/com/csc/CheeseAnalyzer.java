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
        br.readLine();

        // Read each line from the file
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");

            String MilkType = values[8]; 
            String MilkTreatment = values[9]; 
            double Moisture = Double.parseDouble(values[3]); 
            boolean Organic = values[6].equals("1"); 

            // Create a new Cheese object and add it to the list
            cheeses.add(new Cheese(MilkTreatment, Organic, Moisture, MilkType));
        }

        br.close();
        return cheeses;
    }
}


//     public static void main(String args[]){
//     List<List<String>> records = new ArrayList<>();

//         try {
//             BufferedReader br = new BufferedReader(new FileReader("cheese_data.csv"));
//             String line;

//             while((line = br.readLine()) != null){
//                 String[] values = line.split(",");
//                 List<String> record = Arrays.asList(values);
//                 records.add(record);
//             }

//             String output = "";
//             for(List<String> r : records){
//                 //Do something with r? Save it to output?
//             }
//             br.close();

//             try {
//                 FileOutputStream outputStream = new FileOutputStream("output.csv");
//                 byte[] strToBytes = output.getBytes();
//                 outputStream.write(strToBytes);
//                 outputStream.close();
//             } catch (Exception e) {
//                 //do somthing here
//             }
//         } catch (Exception e) {
//             //do something here
//         }

//     }
// }
