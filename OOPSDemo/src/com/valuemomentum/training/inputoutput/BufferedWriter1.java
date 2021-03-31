package com.valuemomentum.training.inputoutput;

 

//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.Reader;
import java.io.BufferedWriter;

 

public class BufferedWriter1 {

 

    public static void main(String[] args) {
      
        try { 
        	//Creating writer obj in append mode-true
            FileWriter writer = new FileWriter("C:\\test\\name.txt",true); 
            BufferedWriter bwr = new BufferedWriter(writer);  

 

            bwr.write("James"); 
            bwr.write("\n"); // bwr.newLine();
            bwr.write("Hobert"); 
            bwr.close(); 

 

            System.out.println("succesfully written to a file"); } 
            catch (IOException ioe) { 
            ioe.printStackTrace(); 

 


    }
    }

 

}