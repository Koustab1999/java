package com.valuemomentum.training.concurrency;
class MyThread3 extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		System.out.println(Thread.currentThread().getName() + " in control");
		
	}
}
//Driver Class
public class YieldDemo {

	public static void main(String[] args) {

		MyThread3 t = new MyThread3();
		t.start();
		for(int i=0;i<5;i++)
		{
			//control passes to child thread
			Thread.yield();
			//After execution of child Thread
			//main thread takes over
			System.out.println("<<<<<<<<<<<<"+Thread.currentThread().getName() + "in control");
		}
	}

}
