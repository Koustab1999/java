package com.valuemomentum.training.bank.HelloMaven;

public class Customer
{
	int accNo;
	String name;
	double balance;
	public Customer(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	void display()
	{
		System.out.println("*******Customer Details******");
		System.out.println(this.accNo+" "+ this.name+ " "+this.balance);
	}

}
