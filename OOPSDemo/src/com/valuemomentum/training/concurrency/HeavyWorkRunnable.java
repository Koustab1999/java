package com.valuemomentum.training.concurrency;

public class HeavyWorkRunnable implements Runnable   // this is second method to create threads
{
	public void run()
	{
		System.out.println("Doing heavy processing -START "+Thread.currentThread().getName());
	try
	{
		Thread.sleep(1000);
		doDBProcessing();
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	System.out.println("Doing heavy processing - END "+Thread.currentThread().getName());
	}
	private void doDBProcessing() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	

}
