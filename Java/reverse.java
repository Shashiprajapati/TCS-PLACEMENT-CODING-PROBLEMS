package Java;
import java.util.Scanner;

public class reverse {
    public static void main(String args[])
    {
        System.out.print("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // System.out.println(str);
        String str2 = "";
        for(int i=str.length()-1; i>=0; i--)
        {
            str2 = str2 + str.charAt(i);
        }
        System.out.println(str2);

    }
}
