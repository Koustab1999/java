import java.util.*;
public class SingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		if(a>=-9 && a<=9)
		{
			System.out.println(a+ "Given number is a Single Digit");
		}
		else
		{
			System.out.println(a+ "Given number is not a Single Digit");
		}
	}

}
