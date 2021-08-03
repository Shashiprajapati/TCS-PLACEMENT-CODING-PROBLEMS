package Java;
import java.util.Scanner;


public class factorial {
    public static void main(String[] args)
    {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;

        for(int i=num; i>=1; i--)
        {
            fact = fact * i;
        }

        System.out.println("The factrial of "+ num + " is " + fact);
        
    }
}
