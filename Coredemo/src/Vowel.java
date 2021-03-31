import java.util.*;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter the Char");
      Scanner sc =new Scanner(System.in);
      char c =sc.next().charAt(0);
      if(c=='a' || c=='A' || c=='e' || c=='E' || c== 'í' || c== 'I' || c== 'o' || c=='O' || c=='u' || c=='U' )
      {
    	  System.out.println("Char is vowel");
      }
      else 
      {
    	  System.out.println("Char is not a vowel");
      }
      
	}

}
