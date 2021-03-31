package com.valuemomentum.training.exception;

public class Tester {
	int id;
	String name;
	float sal;
	public Tester(int id, String name, float sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Tester [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	

}
