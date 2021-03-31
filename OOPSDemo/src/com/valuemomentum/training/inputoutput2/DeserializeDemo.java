package com.valuemomentum.training.inputoutput2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) throws ClassNotFoundException {

		Employee e =null;
		try
		{
			FileInputStream fileIn = new FileInputStream("C:\\test\\employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee) in.readObject();
			in.close();
			fileIn.close();
		}
		catch(IOException i)
		{
			i.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee..");
		System.out.println("Name: " + e.name);
		System.out.println("Address: " + e.address);
		System.out.println("SSN: "+e.number); // it will shoe 0 since ssn is transied
		System.out.println("Number: "+e.number);
	}

}
