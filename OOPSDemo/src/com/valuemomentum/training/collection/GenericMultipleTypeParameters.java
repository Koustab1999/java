package com.valuemomentum.training.collection;
class Employee10      // gene
{
	private String name;

	public Employee10(String name)
	{
		super();
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
	
}
interface pair<K,V>
{
	public K getKey();
	public V getValue();
}
class OrederedPair<K,V> implements pair<K,V>    // user define generic class
{
	private K key;
	private V value;
	
    public OrederedPair(K key, V value)
    {
		super();
		this.key = key;
		this.value = value;
	}
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}
	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
}

public class GenericMultipleTypeParameters {

	public static void main(String[] args) {

		OrederedPair<Integer, String>  op1 = new OrederedPair<Integer, String>(100,"Java");
		System.out.println(op1.getKey() + ":" +op1.getValue());
		
		OrederedPair<String, String>  op2 = new OrederedPair<String, String>("DataBase","MYSQL");
		System.out.println(op2.getKey() + ":" +op2.getValue());

		OrederedPair<Integer,Employee10> op3 = new OrederedPair<Integer,Employee10>(198, new Employee10("Koustab"));
		System.out.println(op3.getKey() + ":" +op3.getValue().getName());

	}

}
