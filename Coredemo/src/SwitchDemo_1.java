import java.util.Scanner;
public class SwitchDemo_1 {

 

    public static void main(String[] args)
    {
        
    Scanner s =new Scanner(System.in);

 

    int number = 48;
    String size;

 

    // switch statement to check size
    switch (number) {

 

    case 29:
        size = "Small";
        break;

 

    case 42:
        size = "Medium";
        break;

 

        // match the value of week
    case 44:
        size = "Large";
        break;

 

    case 48:
        size = "Extra Large";
        break;

 

    default:
        size = "Unknown";
        break;

 

    }
    System.out.println("Size: " + size);
}
}