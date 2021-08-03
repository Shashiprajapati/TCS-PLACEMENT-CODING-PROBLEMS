package Java;
import java.util.Scanner;

public class concat
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String str2 = sc.nextLine();

        String str = str1 + str2;
        System.out.println(str);

    }
}