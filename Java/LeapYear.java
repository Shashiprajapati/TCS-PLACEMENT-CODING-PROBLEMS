package Java;
import java.util.Scanner;

public class LeapYear {

	public static void main(String args[])
	{
		System.out.print("Enter the Year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(((year%100!=0 & year%4==0 )) | year%400==0)
		{

			System.out.print("Entered Year is a Leap year");
		}
		else
		{
			System.out.print("Entered Year is not a Leap year");
		}
	}
	
}
