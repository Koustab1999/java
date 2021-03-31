
public class Emp {

	int id;
	String name;
	Address address; 		//Aggregation(HAS A REALATIONSHIP)
	public Emp (int id, String name, Address address)
	{
		this.id = id;
		this.name =name;
		this.address = address;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" " +address.country);
	}
	public static void main(String args[])
	{
		Address ad1= new Address("Hyderabad","Telangana", "India");
		Address ad2= new Address("Mumbai","Maharastra", "India");
		Emp e1= new Emp(123, "Koustab",ad1);
		Emp e2= new Emp(345, "Rahul",ad2);
		e1.display();
		e2.display();
		
	}
}
