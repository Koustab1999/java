import java.util.*;
public class ThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a > b && a > c)
		{
			System.out.println("A is greater");
		}
		else if (b > c)
		{
			System.out.println("B is greater");
			
		}
		else
		{
			System.out.println("C is greater");
		}
		

	}

}
