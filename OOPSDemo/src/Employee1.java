import java.util.Scanner;
class Employee   // Instance class
{
  int emp_Id;          //properties
  String emp_Name,dept;
  float basic,hra,tax,totalSal;

 

  // methods
 void input()
  {
     Scanner s =new Scanner(System.in);
    System.out.println("Enter Employee Id, Name , Department & Basic Salary");
    emp_Id=s.nextInt();
    emp_Name=s.next();
    dept=s.next();
    basic=s.nextFloat();
   }

 

   float calculateSal()
   {
     hra=basic*.10f;
     tax=basic*.5f;
     totalSal=(basic+hra)-tax;
     return totalSal;
   }

 

   void display()
   {
     System.out.println("The Employee Details :");
     System.out.println("Employeed Id :" +emp_Id);
     System.out.println("Employee Name: "+ emp_Name);
     System.out.println("Department:"+dept);
     System.out.println("Total Salary :"+totalSal);
 } }
public class Employee1 {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub

 

         Employee e1=new Employee(); // Object Declaration
           Employee e2=new Employee();

 

           e1.input();    // method call
           //float s=e1.CalculateSal();
           e1.calculateSal();
           e1.display();
          // System.out.println("The total salary displayed from class: "+s);

 

           e2.input();
           float s1=e2.calculateSal();
           e2.display();
           System.out.println("The total salary displayed from Main: "+s1);
        
    }

 

}