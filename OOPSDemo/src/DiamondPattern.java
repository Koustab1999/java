import java.util.Scanner;
public class DiamondPattern {

 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lines,i,s,j;
        System.out.println("Enter No. of lines (Odd no.)");
        lines=sc.nextInt();
        
        int mid=(lines+1)/2;
        if((lines%2)!=0)
        {
        //upper
        for( i=1;i<=mid;i++)
            {
                for(s=1;s<=mid-i;s++)
                {
                    System.out.print(" ");
                }
                for(j=1;j<=(i*2)-1;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        //lower
        
        for(i=1;i<=mid-1;i++)
        {
            for(s=1;s<=i;s++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=(2*(mid-i))-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        }
        else {
            System.out.println("Wrong Choice");
        }
    }

 

}
 