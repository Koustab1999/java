package com.valuemomentum.training.concurrency;

public class MyThread extends Thread {

	public static void main(String[] args) {

		
		MyThread Objex = new MyThread();    // creating obj for mthread
		Objex.create();
		System.out.println("This is the main thread");
	}
	public void create()
	{
		Thread Objth = new Thread(this); // c?????
		Objth.start(); //?
	}
	public void run()
	{
		while(true)
		{
			try
			{
				System.out.println("This is the child thread");
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
			}
			}
		}
	}


