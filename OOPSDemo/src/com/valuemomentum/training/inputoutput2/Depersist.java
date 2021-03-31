package com.valuemomentum.training.inputoutput2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {						// This is Deserization

	public static void main(String[] args)throws Exception
	{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\test\\f.txt")); // we just print the byte data from Persist class into char
		Student s =(Student)in.readObject();
	
		System.out.println(s.id+" "+s.name);
		in.close();

	}

}

