package com.valuemomentum.training.inputoutput;

//Java program to demonstrate DataOutputStream
//This program uses try-with-resources. It requires JDK 7 or later.

import java.io.*;
class DataOutputStreamDemo
{
 public static void main(String args[]) throws IOException
 {
       try ( DataOutputStream dout =
         new DataOutputStream(new FileOutputStream("C:\\test\\file.txt")) )
     {
         dout.writeDouble(1.1); // storing and writing the 
         dout.writeInt(55);
         dout.writeBoolean(true);
         dout.writeChar('4');
     }
     catch(FileNotFoundException ex)
     {																				// the output will be in  bytes
         System.out.println("Cannot Open the Output File");
         return;
     }
      
     // reading the data back using DataInputStream
     try ( DataInputStream din =
                 new DataInputStream(new FileInputStream("C:\\test\\file.txt")) )
     {
         double a = din.readDouble();
         int b = din.readInt();         // storing and reading the data
         boolean c = din.readBoolean();
         char d=din.readChar();
         System.out.println("Values: " + a + " " + b + " " + c+" " + d);
     }
     catch(FileNotFoundException e)
     {
         System.out.println("Cannot Open the Input File");
         return;
     }
 }
}
