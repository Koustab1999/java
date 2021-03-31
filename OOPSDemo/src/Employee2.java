
public class Employee2 {


    
    String name,address;
    int salary,year;
    Employee2(){
        
    }
    Employee2(String n,String addr,int yr,int sal){
        this.name=n;
        this.address=addr;
        this.year=yr;
        this.salary=sal;
        
    }

 

    void display() {
        
        System.out.print(this.name+"       ");
        System.out.print(this.year+"        ");
        System.out.print(this.address+"    ");
        System.out.print(this.salary+"    ");
        System.out.println();
    }
    public static void main(String[] args) {
    
        Employee2 ob1=new Employee2("Robert","64C- WallsStreet",1994,78000);
        Employee2 ob2=new Employee2("Sam   ","68D- WallsStreet",2000,98989);
        Employee2 ob3=new Employee2("John  ","26B- WallsStreet",1999,87978);
        System.out.print("Name "+"    ");
        System.out.print("Year of joining "+"    ");
        System.out.print("Address "+"       ");
        System.out.print("Salary ");
        System.out.println();
        ob1.display();
        ob2.display();
        ob3.display();

 

    }

 

}