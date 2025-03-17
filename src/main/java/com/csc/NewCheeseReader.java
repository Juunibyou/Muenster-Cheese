// package com.csc;

// import java.io.BufferedReader;
// import java.io.FileReader;

// public class NewCheeseReader {
//     private String filename;
//     private CheeseParser parser = new CheeseParser();
//     private CheeseRowCleaner cleaner = new ClearRowCleaner();

//     public CheeseList read_cheeses(){
//         CheeseList list = new CheeseList();

//         try{
//             BufferedReader reader = new BufferedReader(new FileReader(filename));
//             String line;
//             while ((line = reader.readLine()) != null) {
//                 Cheese cheese = deserialize_cheese(line);
//                 list.addCheese(cheese);
//             }
//         } catch (Exception e) {
//             //do something here
//         }

//         return list;
//     }

//     private Cheese deserialized_cheese(String line){
//         String cleaned_line = cleaner.clean(line);
//         Cheese cheese = parser.parse(cleaned_line);
//         return cheese;
//     }
// }
