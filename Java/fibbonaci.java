package Java;
import java.util.Scanner;

public class fibbonaci {
    public static void main(String[] args)
    {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a=1, b=1, i, total;

        if(num==1)
        {
            System.out.print("Fibbonaci Series is: 0");
        }
        else if(num==2)
        {
            System.out.print("Fibbonaci Series is: 0 "+ a);
        }
        else
        {
            System.out.print("Fibbonaci Series is: 0 1 1 ");
            for(i=1; i<=num-3; i++)
            {
                total = a+b;
                b = a;
                a = total;
                System.out.print(total + " ");
            }
        }

    }
}
