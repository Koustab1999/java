
public class Complex 
{
	double real;
	double imaginary;
	Complex(double r, double i)
	{
		real =r;
		imaginary =i;
	}
	void add(Complex obj2)
	{
		this.real += obj2.real;
		this.imaginary += obj2.imaginary;
	}
	void display()
	{
		System.out.println(this.real + " +i" + this.imaginary);
	}


	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub

		Complex obj1 = new Complex (10.82,39.93);
		Complex obj2 = new  Complex (1.9,3.9);
		obj1.add(obj2);
		System.out.println("The addition of Complex number is : ");
		obj1.display();
	}

}
