class Arithmetic
{
 public static void main(String [] args)
 {
   int a=9,b=5,sum,sub,mul,mod;   // variable declaration
   float div;
 
   sum =a+b;
   sub =a-b;
   mul =a*b;
   div =(float)a/b;    // type casting- convertion of data types
   mod =a%b;         // modulus operator- Remainder of Division

   System.out.println("The Addition of two numbers is :"+ sum);
   System.out.println("The Subtraction of two numbers is :"+ sub);
   System.out.println("The Multipication of two numbers is :"+ mul);
   System.out.println("The Dicision of two numbers is :"+ div);
   System.out.println("The Modulus of two numbers is :"+ mod);
}
}