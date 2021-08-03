package Java;
import java.util.Scanner;

public class greatest {
    public static void main(String args[])
    {
        int n=10;
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        

        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the number: ");
            a[i] = sc.nextInt();
            
        }
        // System.out.println(a[0]);
        int max = a[0];

        for(int i=0; i<n; i++)
        {
            if(a[i]> max)
            {
                max = a[i];
            }
        }

        System.out.println(max);

    }
    
}
