package Java;
import java.util.Scanner;

public class average
{
    public static void main(String[] args)
{
    int num1, num2;
    double total;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st number: ");
    num1 = sc.nextInt();
    System.out.print("Enter 2nd number: ");
    num2 = sc.nextInt();

    total = (num1+num2)/2;
    System.out.println("Average is: "+ (float)total);
}
}