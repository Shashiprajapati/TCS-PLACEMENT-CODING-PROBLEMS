#include<stdio.h>

int main()
{
    int fact=1, num, i;
    printf("Enter the number: ");
    scanf("%d", &num);

    for(i=num; i>=1; i--)
    {
        fact = fact*i;
    }

    printf("The factorial of %d is %d", num, fact);

}