package com.valuemomentum.training.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {

		ArrayList<Students> al =new ArrayList<Students>();
		al.add(new Students(111, "John", 29));
		al.add(new Students(222, "Mike", 21));
		al.add(new Students(333, "Mary", 26));
	
		Collections.sort(al);
		for(Students st:al)
		{
			System.out.println(st.rollno+""+st.name+""+st.age);
		}
	}

}
