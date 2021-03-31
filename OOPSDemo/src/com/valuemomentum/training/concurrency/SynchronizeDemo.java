package com.valuemomentum.training.concurrency;

// This code is Multithreading environment and thread synchronization

class First
{
	synchronized public void display(String msg) // this is thread synchronized it will print one thread at a time
	{
		System.out.println("["+msg);
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.print("]");
		
	}
}
class Second extends Thread

{
	String msg;
	First fObj;
	public Second(String msg, First fObj)
	{
		super();
		this.msg = msg;
		this.fObj = fObj;
		start();  							//?		
	}
	public void run()
	{
		fObj.display(msg);
	}
	
	
}
public class SynchronizeDemo {

	 public static void main(String[] args)
	{
		First f1 = new First();
		Second s1 = new Second("Welcome",f1);
		Second s2 = new Second("Java",f1);

		Second s3 = new Second("Programmer",f1);
		

		
	}

}
