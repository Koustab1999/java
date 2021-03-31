
public class ConstructorDemo {

	int id;
	ConstructorDemo() 							// Default Constructor
	{
		System.out.println("In Constructor");
		id=10;
	}
	void display()
	{
		System.out.println(id);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ConstructorDemo obj1 = new ConstructorDemo();  	//Define objects & invokes constructor
		ConstructorDemo obj2 = new ConstructorDemo(); 
		obj1.display();
	}

}
