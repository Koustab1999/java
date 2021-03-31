package com.valuemomentum.training.collection;
class Sample<T>   // Generic class
{
	private T data;

	public Sample(T data)  // generic constructor
	{
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
public class GenericClassDemo {

	public static void main(String[] args) {

		Sample<Integer> s1 = new Sample<Integer>(19);  // creating a object of generic class
		//s1.setData(19); 
		//s1.getData();
		System.out.println("Display from genriec class of type integer : " +s1.getData());
		
		Sample<String> s2 = new Sample<String>("Java");  // creating a object of generic class
		//s2.setData("Java"); 
		//s2.getData();
		System.out.println("Display from genriec class of type String : " +s2.getData());
		
		Sample<Float> s3 = new Sample<Float>(120.35f);  // creating a object of generic class
		//s3.setData(120.35f); 
		//s3.getData();
		System.out.println("Display from genriec class of type float : "+s3.getData());
	}

}
