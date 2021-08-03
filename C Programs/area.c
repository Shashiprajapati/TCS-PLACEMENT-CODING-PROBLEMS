#include <stdio.h> // header files
#include <conio.h>
int main()
{ 
    int base, height, radius;
    float area_tri, area_cir;
    printf("Enter the Radius of circle: ");
    scanf("%d", &radius);
    area_cir = 3.14*radius*radius;
    printf("Area of Circle is: %.2f \n", area_cir);

    printf("Enter the base of triangle: ");
    scanf("%d", &base);
    printf("Enter the height of triangle: ");
    scanf("%d", &height);
    area_tri = 0.5*base*height;
    printf("Area of Triangle is: %.2f \n", area_tri);


}