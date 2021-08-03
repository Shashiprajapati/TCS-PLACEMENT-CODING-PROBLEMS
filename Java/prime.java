package Java;
import java.util.Scanner;

public class prime {
    public static void main(String[] args)
    {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
        if(num > 1)
        {
            for(int i=2; i <= num/2; i++)
            {
                if(num % i == 0)
                {
                   flag = true; 
                   break;
                } 
            }
        }

        if(flag == true)
        {
            System.out.println("The number is not prime number");
        }
        else
        {
            System.out.println("The number is prime number");
        }

    }
}
