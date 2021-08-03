package Java;
import java.util.Scanner;

public class area {
    public static void main(String[] args)
    {
        int radius, base, height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        radius = sc.nextInt();
        double area_cir = 3.14 *radius*radius;
        System.out.println("Area of circle is: "+ (float)area_cir);
        
        System.out.print("Enter the base of triangle: ");
        base = sc.nextInt();
        System.out.print("Enter the height of triangle: ");
        height = sc.nextInt();
        double area_tri = 0.5*base*height;
        System.out.println("Area of Triangle is: "+ (float)area_tri);

    }
}
