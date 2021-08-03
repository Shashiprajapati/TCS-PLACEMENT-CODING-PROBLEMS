#include <stdio.h>
#include <conio.h>

int main()
{
    int radius;
    printf("Enter the radius of circle: ");
    scanf("%d", &radius);
    float cir;
    cir = 2 * 3.14 * radius;
    printf("%.2f", cir);
}
