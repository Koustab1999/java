import java.util.Scanner;
public class SwitchDemo {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a,b,res;
        String op;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Enter a an operator");
        op = s.next();

 

        switch(op)
        {
        case "+" : res = a+b;
        System.out.println("Addition="+res);
        break;

 

        case "-" : res = a-b;
        System.out.println("Substraction="+res);
        break;

 

        case "*" : res = a*b;
        System.out.println("Multiplication="+res);
        break;

 

        case "/" : res = a/b;
        System.out.println("Divison="+res);
        break;

 

        default:
            System.out.println("Invalid Input");
            break;
        }
    }

 

}