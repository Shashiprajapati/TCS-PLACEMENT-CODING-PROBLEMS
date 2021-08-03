#include<stdio.h>

int main()
{
    int n=10, i, max;
    int a[10];

    for(i=0; i<n;i++)
    {
        printf("Enter the number:");
        scanf("%d", &a[i]);
    }

    max = a[0];
    for(i=0; i<n; i++)
    {
        if(a[i] > max)
        {
            max = a[i];
        }
    }

    printf("The greatest among above 10 numbers are: %d", max);

    return 0;

}