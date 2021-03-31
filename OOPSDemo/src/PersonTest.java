

public class PersonTest{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj1=new Person("Koustab",21);  // parameterized constructor
		Person obj = new Person();			   // invoke default constructor
		Person obj2=new Person("Koustab", 21, "Hyd");
		obj.input();
		obj.print();
		obj1.print();
		obj2.print();
		
	}

}