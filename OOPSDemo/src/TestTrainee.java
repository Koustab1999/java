import java.util.Scanner;
class Trainee         // class declaration
{                     
	int tId;					// define properties 
	String tName;
	String Technology;
	Float Salary, Stipend;
	
	void input()  				// define methods
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Id, Name, technology & salary of a Traniee :");
		tId= sc.nextInt();
		tName= sc.next();
		Technology= sc.next();
		Salary= sc.nextFloat();
		
	}
	Float calculate()
	{
		return Stipend = Salary -200;
	}
	void display()
	{
		System.out.println("*******Traniee Details*********");
		System.out.println("Trainee Id :"+ tId);
		System.out.println("Trainee Name :"+ tName);
		System.out.println("Technology :"+ Technology);
		//System.out.println("Salary :"+ Salary);
		
	}
	
}
public class TestTrainee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trainee t1 = new Trainee(); 
		Trainee t2 = new Trainee();     // creating objects of Trainee class
		t1.input(); 
		t2.input(); 					// method call
		float s1 =t1.calculate();
		float s2 =t2.calculate();
		t1.display();	
		System.out.println("Salary :"+ s1);
		t2.display();					// method call 
		System.out.println("Salary :"+ s2);
	}

}
