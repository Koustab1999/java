class Animal
{
	String  name;
	public void eat() 					// method
	{
		System.out.println("I can eat");
	}
}
class Dog extends Animal				// inherit from Animal
{
	public void display()					// method
	{
		System.out.println("My name is :" + name);
	}
}
	

public class AnimalTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Dog l =new Dog();
		l.name = "Rahul";
		l.display();
		l.eat();
		{
		
	}
	}
}




