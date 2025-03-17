// package com.csc;

// import java.io.FileOutputStream;

// public class NewCheeseWriter {
//     private String filename;

//     public CheeseWriter(String output_filename){
//         filename = output_filename;
//     }

//     public void write_data(String string){
//         try{
//             FileOutputStream outputStream = new FileOutputStream(filename);
//             byte[] strToBytes = string .getBytes();
//             outputStream.write(strToBytes);
//             outputStream.close();
//         } catch (Exception e) {
//             //do something here
//         }
//     }
// }
