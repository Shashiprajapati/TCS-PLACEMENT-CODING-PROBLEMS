#include<stdio.h>

int main()
{
    int num1, num2;
    float total;
    printf("Enter 1st number: ");
    scanf("%d", &num1);
    printf("Enter 2nd number: ");
    scanf("%d", &num2);

    printf("%d %d \n", num1, num2);
    total = (float)(num1+num2)/2;
    printf("The average is: %.2f", total);

    return 0;
}