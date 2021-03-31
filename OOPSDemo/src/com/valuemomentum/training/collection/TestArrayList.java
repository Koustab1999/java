package com.valuemomentum.training.collection;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class TestArrayList {      // program to create array list

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>(); //creating array list // upcasting
	al.add("Jim"); //adding object in too array list
	al.add("Michael");
	al.add("James");
	al.add("Andy");
	
	// traversing elements using Iterator
	/*Iterator itr = al.iterator();   // we can also use for loop 
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}*/
	al.add(3,"Koustab"); // ADDING ELEMENT IN SPECIFIES INDEX
	al.remove(3); //delete the content
	al.set(2,"KPJ");// replace existing content
	for(String i:al)
	{
		System.out.println(i);
	}
	}

}
