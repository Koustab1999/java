package com.valuemomentum.training.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetUserDefined {

	public static void main(String[] args) {

		Set<Employee> empset = new HashSet<Employee>();
		
		Employee e1 = new Employee(100,"John2", 5000);
		Employee e2 = new Employee(200,"John3", 4000);
		Employee e3 = new Employee(300,"John4", 7000);
		Employee e4 = new Employee(400,"John5", 6000);
	
	empset.add(e1);
	empset.add(e2);
	empset.add(e3);
	empset.add(e4);
	
	//TreeSet<Employee> tset = new TreeSet<Employee>(empset);
	//tset.add(600, "Kpj");
	//System.out.println(tset);
	
	for(Employee e :empset)
	{
		System.out.println(e.id+" "+e.name+" "+e.sal);
	}
		
	}

}
