package com.valuemomentum.training.exception;

public class ExceptionDemo {

	public static void main(String[] args) {

		String language[] = { "C", "C++", "JAVA", "PERL", "PYTHON"};
		try
		{
			for(int c = 0; c<=5; c++)
			{
				System.out.println(language[c]);
			}
		}
		catch(Exception e)  // general exception
		{
			System.out.println(e);

			System.out.println(e.getMessage());
			e.printStackTrace();  // it shows the where is the error
		}
		finally
		{
			System.out.println("In Finally Block");      /// i want to sort by using treemap
		}
		}
}
		


