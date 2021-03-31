
package com.valuemomentum.training.wrapper;
import java.util.Scanner;
public class DemoInteger {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
      System.out.println("Enter a Number:");
		num= s.nextInt();
		
		Integer n=new Integer(num);  // wrapper class
		
		String hexNum =n.toHexString(num);
		String octNum=n.toOctalString(num);
		String binNum=n.toBinaryString(num);
		
		System.out.println("The Hexa Equivalent of "+ num + " is "+hexNum);
		System.out.println("The Octal Equivalent of "+ num + " is "+octNum);
		System.out.println("The Binary Equivalent of "+ num + " is "+binNum);
		
		String hex1="0xAA";
		
		System.out.println(Integer.decode(hex1));
		
		long sal=500000;
		
		Long salary=Long.valueOf(sal);
		
		System.out.println(salary);
		
		
		
	}

}