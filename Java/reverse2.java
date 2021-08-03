package Java;
import java.util.Scanner;

public class reverse2 {
    public static void main(String args[])
    {
        System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
        int num2 = 0;
        int remainder;
        while(num1 != 0)
        {
            remainder = num1 % 10;
            num2 = num2*10 + remainder;
            num1 = num1/10;
        }
        System.out.println("Reverse of the number is: "+ num2);

        }
        

    }
