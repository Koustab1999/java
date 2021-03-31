package com.valuemomentum.training.inputoutput2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {     // This is Serialization

	public static void main(String[] args)throws Exception
	{

		Student s1 =new Student(101,"Koustab");
		FileOutputStream fout=new FileOutputStream("C:\\test\\f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		System.out.println("success");
	}

}
