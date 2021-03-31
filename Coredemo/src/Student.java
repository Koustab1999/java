import java.util.*;
import java.util.Scanner;
public class Student {

 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the student");
        String name=sc.next();
        System.out.println("enter the age");
        int age=sc.nextInt();
        System.out.println("enter branch");
        String branch=sc.next();
        System.out.println("enter subject1 marks:");
        int sub1=sc.nextInt();
        System.out.println("enter subject2 marks:");
        int sub2=sc.nextInt();
        System.out.println("enter subject3 marks:");
        int sub3=sc.nextInt();
        System.out.println("enter subject4 marks:");
        int sub4=sc.nextInt();
        int total_score=sub1+sub2+sub3+sub4;
        int average=(int)total_score/4;
        if(sub1<=34 || sub2<=34 || sub3<=34 || sub4<=34) {
            System.out.println(name+" has failed to get minimun marks in a one subject hence results are withheld");
        }
        else {
        if(average<100 && average>=90) {
            System.out.println("the grade of "+name+" is A");
        }
        else if(average<90 && average>=80) {
            System.out.println("the grade of "+name+" is B");
        }
        else if(average<80 && average>=70) {
            System.out.println("the grade of "+name+" is C");
        }
        else if(average<70 && average>=60) {
            System.out.println("the grade of "+name+" is D");
        }
        else if(average<60 && average>=40) {
            System.out.println("the grade of "+name+" is E");
        }
        else {
            System.out.println(name+" has  failed the tests");
        }
        }
        sc.close();        

 

    }

 

}