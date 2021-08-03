package Java;
import java.util.Scanner;

public class swap {
    public static void main(String[] args)
    {
        System.out.print("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
    
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("First number after swapping is: "+ num1);
        System.out.println("Second number after swapping is: "+ num2);

    }    
}
