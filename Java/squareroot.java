package Java;
import java.util.Scanner;

public class squareroot {
    public static void main(String[] args)
    {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;

        if(num>1)
        {
            for(int i = 2; i<=num/2; i++)
            {
                if(num%i==0)
                {
                    flag = true;
                    break;
                }
            }
        }

        if(flag==true)
        {
            System.out.println("The number is not Prime number.");
        }
        else
        {
            // System.out.println("The number is Prime number.");
            System.out.println("Square root of prime number "+ num+ " is " + String.format("%.2f", squareRoot(num)));
        }

    }

    public static double squareRoot(int num)   
    {  
    //temporary variable  
    double t;  
    double sqrtroot=num/2;  
    do   
    {  
    t=sqrtroot;  
    sqrtroot=(t+(num/t))/2;  
    }   
    while((t-sqrtroot)!= 0);  
    return sqrtroot;  
    }

}
