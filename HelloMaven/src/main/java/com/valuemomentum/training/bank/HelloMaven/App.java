package com.valuemomentum.training.bank.HelloMaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "******Banking Application*******" );
        Customer c1 = new Customer(101,"Koustab",5000);
        c1.display();
    }
}
