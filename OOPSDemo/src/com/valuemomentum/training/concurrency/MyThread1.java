package com.valuemomentum.training.concurrency;

public class MyThread1 extends Thread{   // their are two ways to created thread 1.Extends, 2.Implements.
	
	public void run()      // this is just a method 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		
		MyThread1 t1=new MyThread1();
		t1.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");   // any thread you create that will be a part of main thread 
		}
	
	}

}
