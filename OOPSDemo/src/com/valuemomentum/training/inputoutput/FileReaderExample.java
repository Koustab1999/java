package com.valuemomentum.training.inputoutput;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderExample {

	public static void main(String[] args) {

		try
		{
			Reader r = new FileReader("C:\\test\\data.txt");
			int data =r.read(); // returns ascii value of character
			//System.out.println(r);
			while(data !=-1) // -1 when stream ends
			{
				System.out.println((char) data);
				data =r.read();
			}
			r.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
