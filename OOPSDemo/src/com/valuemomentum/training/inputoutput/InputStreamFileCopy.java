package com.valuemomentum.training.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamFileCopy {

	public static void main(String[] args) {
		try {
            InputStream is = new FileInputStream("C:\\test\\countries.txt");// inputstream
            
            OutputStream os = new FileOutputStream("C:\\test\\countries_copy.txt"); //outputstream
            
            byte[] buffer = new byte[1024]; // converting the data into byte
            int bytesRead;
            //read from is to buffer
            while((bytesRead = is.read(buffer)) !=-1){ //we are reading and storing the data
                os.write(buffer, 0, bytesRead); // method write the contain
            }
            System.out.println("File Copied");
            is.close();
            //flush OutputStream to write any buffered data to file
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();        }    }	}


