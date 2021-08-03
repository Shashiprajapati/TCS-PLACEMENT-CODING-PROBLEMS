package Java;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[])
    {
        int num, sum=0, rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        while(num != 0)
        {
            rem = num % 10;
            sum = sum +rem;
            num = num/10;
        }

        System.out.println("The Addition of given number is: "+ sum);
    }
}
