#include<stdio.h>

int main()
{
    int gcd=1, num1, num2, i;

    printf("Enter first number: ");
    scanf("%d", &num1);
    printf("Enter second number: ");
    scanf("%d", &num2);

    for( i = 1; i <= num1 && i <= num2; ++i)  
    {  
        if (num1 % i ==0 && num2 % i == 0)  
            gcd = i;   
    } 

    printf("The GCD is: %d", gcd);

    return 0;
}