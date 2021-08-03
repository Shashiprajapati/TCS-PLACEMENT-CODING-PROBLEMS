package Java;
import java.util.Scanner;

public class hcf {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int gcd=1;
        int i = 1;
        while(i<=num1 & i<=num2)
        {
            if((num1 % i == 0) & (num2 % i == 0))
            {
                gcd = i;
            }
            i++;
        }
        
        System.out.println("The GCD is: "+ gcd);
    }

}
