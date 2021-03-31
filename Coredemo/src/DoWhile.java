import java.util.*;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
	    int number = 0;
       Scanner input = new Scanner(System.in);
       do
       {
    	   sum += number;  // a = a+b
    	   System.out.println("Enter a number");
    	   number = input.nextInt();
       } while(number >=0);
       System.out.println("Sum =" + sum);
       input.close();
       
       }
	}


