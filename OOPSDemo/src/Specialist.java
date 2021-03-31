
public class Specialist extends Doctor {

	protected String speciality;
	Specialist()
	{
		
	}
	Specialist(final String str, final int num, final String addr, final String special)
	{
		super(str, num, addr);			// invoke base class constructor
		speciality = special;
	}
	void display()
	{
		super.display();
		System.out.println("The Speciality is :" + speciality);
	}

	

}
