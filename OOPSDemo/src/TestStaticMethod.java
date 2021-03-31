class Student200								//static programming
{
	private int rollnumber;
	private String Name;
	static String college ="KMIT";
	static void changeCollege()
	{
		college ="CBIT";
		//rollnumber = 2;					//only static variable can use the static 
	}
	public Student200(int r, String s)
	{
		rollnumber=r;
		Name=s;
	}
	public void display()
	{
		System.out.println(rollnumber+ " " +Name + " " +college);
	}
}
public class TestStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student200.changeCollege();			//call static method without creating of object
	
		Student200 s1 = new Student200(123,"Koustab");
		Student200 s2 =new Student200(456, "Rahul");
		Student200 s3 =new Student200(789, "Raj");
		s1.display();
		s2.display();
		s3.display();
	
	}

}
