package com.valuemomentum.training.inputoutput2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = " Micheal Khan";
		e.address = "Castle Street, Bangalore";
		e.SSN = 11122333;
		e.number = 101;
		try
		{			FileOutputStream fileOut = new FileOutputStream("C:\\test\\employee.ser");

			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in C:\\test\\employee.ser ");
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
	}

}
