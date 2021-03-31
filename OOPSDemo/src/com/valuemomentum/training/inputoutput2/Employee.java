package com.valuemomentum.training.inputoutput2;

public class Employee {
	public String name;
	public String address;
	public transient int SSN;   ///?
	public int number;
	
	//generate constructor
	
	
	public void mailCheck()  //method
	{
		System.out.println("Mailing a check to " + name + " " + address);
	}

	/*public Employee(String name, String address, int sSN, int number) {
		super();
		this.name = name;
		this.address = address;
		SSN = sSN;
		this.number = number;
	}*/

}
