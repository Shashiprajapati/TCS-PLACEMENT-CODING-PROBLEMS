package Java;
import java.util.Scanner;

public class lcm {
    public static void main(String[] args)
    {
        int max, lcm;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        if(num1>num2)
        {
            max = num1;
        }
        else{
            max = num2;
        }

        while(true)
        {
            if((max%num1==0) & (max%num2==0))
            {
                lcm = max;
                break;
            }
            max++;
        }
        System.out.println("The LCM is: "+ lcm);

    }
}
