
public class ThisDemo {

	int instVar;
	ThisDemo(int instVar)
	{
		this.instVar = instVar;
		System.out.println("this reference = "+ this);
	}
	public static void main(String[] args) {
		
	// TODO Auto-generated method stub

		ThisDemo obj =new ThisDemo(8);   		// invokes constructor
		System.out.println("object reference = "+ obj);
	}

}
