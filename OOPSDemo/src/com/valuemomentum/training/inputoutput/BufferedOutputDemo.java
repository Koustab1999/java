
package com.valuemomentum.training.inputoutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

class BufferedOutputDemo
{
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fout=new FileOutputStream("C:\\test\\f1.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="Sachin is my Favourite Player";
		byte b[]=s.getBytes();
		bout.write(b);
		
		bout.flush();
		bout.close();
		bout.close();
		System.out.println("Success");
	}
	
}


