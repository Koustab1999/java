import java.util.Scanner;

 

public class Area {
    int length,breadth;
    
    
    Area(int l ,int b){
        length=l;
        breadth=b;
        
    }
    double returnArea() {
        double ar=0.5*length*breadth;
        return ar;
    }

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Length and Breadth");
        int l=s.nextInt();
        int b=s.nextInt();
        Area a=new Area(l,b);
        System.out.println("Area of Triangle is: "+a.returnArea());
        
    }

 

}