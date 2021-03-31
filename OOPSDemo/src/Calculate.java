
public class Calculate {       //methodOverloading
	void sum()
	{
		System.out.println("Method Overloading");
	}
	void sum(int a, int b)
	{
		System.out.println("sum is "+(a+b));
	}
	void sum(float a,float b)
	{
		System.out.println("sum is "+(a+b));
		
	}
	void sum(String a, String b)
	{
		System.out.println("Concatination is "+(a+b));
	}

	public static void main(String args[])
	{
		Calculate cal = new Calculate();
		cal.sum();
		cal.sum(10,20);
		cal.sum(4.6f,3.8f);
		cal.sum("Hello","World");
	}
}
