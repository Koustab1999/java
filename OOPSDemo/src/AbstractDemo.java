abstract class Animal3
{
	abstract void makeSound();
	public void eat()
	{
		System.out.println("I can eat. ");
	}
	
	
}
class Dog3 extends Animal3
{
	public void makeSound()   //provide implementation of abstract method
	{
		System.out.println("Bark bark");
	}
}
public class AbstractDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog3 d1 = new Dog3();
		d1.makeSound();
		d1.eat();
	}

}
