package com.valuemomentum.training.collection;

import java.util.ArrayList;
import java.util.Collections;

class TestSort{  
public static void main(String args[]){  
  
ArrayList<String> al=new ArrayList<String>();  

al.add("John");  
al.add("Mike");  
al.add("Raj");  
al.add("Mary");  
  
Collections.sort(al);      // this type of sorting is for primitive data type
System.out.println(al); 

Collections.sort(al,Collections.reverseOrder());  
System.out.println(al);  

System.out.println("Maximum Element: "+ Collections.max(al));

 }  
}  