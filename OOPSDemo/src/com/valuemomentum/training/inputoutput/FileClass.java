package com.valuemomentum.training.inputoutput;

import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String [] args)
	{
		try
		{
			File f = new File("C:\\Training\\Java\\OOPSDemo\\src\\com\\valuemomentum\\training\\inputoutput\\hello.txt");
			if (f.createNewFile())
			{
				System.out.println("New File created!");
			}
			else {
				System.out.println("The file already exists.");
			}
		}
			catch(IOException e)
			{
				e.printStackTrace();
				
			}
	
}
}


