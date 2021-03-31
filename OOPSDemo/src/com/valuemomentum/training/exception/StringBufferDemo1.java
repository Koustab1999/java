package com.valuemomentum.training.exception;

public class StringBufferDemo1 {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("JamesGosling");
		int l = str.length();
		System.out.println("The length of string is :"+l);
		System.out.println("The Capacity of String is :" + str.capacity());  //28= 12+16 .allocate a space for 16 char default
		//System.out.println("The reversed string:"+ str.reverse());  //reverse the string
		System.out.println("The Substring :"+ str.substring(0,6)); // returns a string from starting index to length -1;
		str.replace(5,10,"Java");
		System.out.println(str);
		str.delete(2,5);
		System.out.println(str);
		System.out.println("The reversed string:"+ str.reverse());  //reverse the string

	}

}
