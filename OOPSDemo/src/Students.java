import java.util.Scanner;

public class Students implements iMaths {

	@Override
	public void add() {
		// TODO Auto-generated method stub

		 Scanner kb = new Scanner(System.in);

         System.out.println("Enter any two integer values to perform addition");

         int a=kb.nextInt();

         int b=kb.nextInt();

         int s=a+b;

         System.out.println("Sum of "+a+" and "+b+" is "+s);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub

		 Scanner kb = new Scanner(System.in);

         System.out.println("Enter any two integer values to perform substraction");

         int a=kb.nextInt();

         int b=kb.nextInt();

         int s=a-b;

         System.out.println("Difference of "+a+" and "+b+" is "+s);
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

        System.out.println("Enter any two integer values multiplication");

        int a=kb.nextInt();

        int b=kb.nextInt();

        int s=a*b;

        System.out.println("Product of "+a+" and "+b+" is "+s);
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
	    

		Scanner kb = new Scanner(System.in);

		System.out.println("Enter any two integer values division");

		int a=kb.nextInt();

		int b=kb.nextInt();

		int s=a/b;

		System.out.println("Quotient of "+a+" and "+b+" is "+s);


		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students s1 = new Students();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();
		
		
	}

}
