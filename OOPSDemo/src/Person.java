import java.util.Scanner;
import java.util.*;
public class Person {
 
	private String name;
    private int age;
    private String constituency;
    Scanner sc;
    Person()
    {
    	System.out.println("Voter Eligiblity App");
    	age=0;
    	name="";
    	constituency="Hyderabad";
    	sc=new Scanner(System.in);
    	//Scanner sc = new Scanner(System.in);
    }
    Person(String n,int a)  //parameterizes constructor
    {
    	name=n;
    	age=a;
    }
    Person(String n,int a,String c) // parameterized constructor
    {
     name=n;
     age=a;
     constituency=c;
    
  }
    public void input() {
        System.out.println("Enter Your Name:");
       name=sc.next();
       System.out.println("Enter Your age:");
        age = sc.nextInt();
       }
    public void print()
    {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Constituency is: " + constituency);
        }
}



