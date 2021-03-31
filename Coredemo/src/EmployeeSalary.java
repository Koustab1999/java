import java.util.Scanner;
public class EmployeeSalary {

 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee name");
        String emp_name=sc.next();
        System.out.println("enter employee id");
        String id=sc.next();
        int basic=0;
        float hra=0;
        float da=0;
        int pf=1800;
        float net_salary;
        switch(id)
        {
        case "emp01":
            basic=10000;
            hra=(float)(0.15)*basic;
            da=(float)(0.3)*basic;
            net_salary=(float)(basic+hra+da)-pf;
            System.out.println("Net salary of "+emp_name+" is "+net_salary);
            break;
        case "emp02":        
            basic=20000;
            hra=(float)(0.15)*basic;
            da=(float)(0.3)*basic;
            net_salary=(float)(basic+hra+da)-pf;
            System.out.println("Net salary of "+emp_name+" is "+net_salary);
            break;
        case "emp03":
            basic=30000;
            hra=(float)(0.15)*basic;
            da=(float)(0.3)*basic;
            net_salary=(float)(basic+hra+da)-pf;
            System.out.println("Net salary of "+emp_name+" is "+net_salary);
            break;
        default:
            System.out.println("employee does'nt belong to the payroll of this company");
            break;
        }
        
        sc.close();
    }

 

}