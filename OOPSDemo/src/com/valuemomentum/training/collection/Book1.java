package com.valuemomentum.training.collection;
/*public class Book1 
{

	int id;
	String name,author,publisher;
	int quantity;
	public Book1(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
}
*/
class A{   

static String m(float i)
 {
 return "float"; 
}
static String m(double i) 
{
return "double";
}

public static void main (String[] args) {
int a1 = 1; long b1 = 2;

System.out.print(m(a1)+","+ m(b1));
}
}