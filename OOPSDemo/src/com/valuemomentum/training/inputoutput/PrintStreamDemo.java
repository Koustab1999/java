package com.valuemomentum.training.inputoutput;

import java.io.*;



public class PrintStreamDemo{    

 

     public static void main(String args[])throws Exception{   
     
       FileOutputStream fout=new FileOutputStream("C:\\test\\testout.txt ");    
       PrintStream pout=new PrintStream(fout);    
       pout.println(2016);    
       pout.println("Hello Java");    
       pout.println("Welcome to Java");    
       pout.close();    
       fout.close();    
      System.out.println("Success?");    
     }    
    }    