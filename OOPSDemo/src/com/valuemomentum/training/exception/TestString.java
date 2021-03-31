package com.valuemomentum.training.exception;

//Java program to understand  
//the concept of == operator 
public class TestString { 
 public static void main(String[] args) 
 { 
     String s1 = new String("HELLO"); 
     String s2 = new String("HELLO"); 

      String str1="hello";
	 String str2="hello";

     System.out.println(s1 == s2); 
     System.out.println(s1.equals(s2)); 

	System.out.println(str1 == str2); 
     System.out.println(str1.equals(str2));

	System.out.println(str1.length());
	System.out.println(str1.toLowerCase());
	System.out.println(str1.endsWith("o"));
   

 } 
} 