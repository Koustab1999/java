import java.util.Scanner;

 

public class Employee3 {
    
    int salary,workhours;
    
    void getinfo(int sal,int wh) {
        salary=sal;
        workhours=wh;
        
    }
    void AddSal() {
        if(salary<500)
        {
            salary=salary+10;
        }
        
    }
    void AddWork() {
        if(workhours>6) {
            salary=salary+5;
        }
        
    }
    void getSalary() {
        System.out.println("Final Salary is: "+salary);
    
    }

 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee3 ob=new Employee3();
        ob.getinfo(600, 6);
        ob.AddSal();
        ob.AddWork();
        ob.getSalary();

 

    }

 

}