package com.valuemomentum.training.collection;

public class Students implements Comparable<Students>
{

	int rollno;
	String name;
	int age;
	public Students(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Students st)
	{
		if(age==st.age)
		return 0;
		//return age;
		else if(age>st.age)
		    return 1;
        else
            return -1;
    }
			
		
	}
	

