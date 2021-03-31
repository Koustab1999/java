package com.valuemomentum.training.exception;

public class ThrowsDemo {
	void Division() throws ArithmeticException  // a method is having a throws keyword
	{
		int a =45,b=0,rs;
		rs =a/b;
		System.out.println("The result is : " +rs);
		
	}

	public static void main(String[] args) {

		ThrowsDemo T =new ThrowsDemo();
		try
		{
			T.Division();
		}
		catch(ArithmeticException Ex)
		{
			System.out.println("it's arthmetic exception ");
			
		}
		finally
		{
			System.out.println("End the program");
		}
		
		
	}

}
