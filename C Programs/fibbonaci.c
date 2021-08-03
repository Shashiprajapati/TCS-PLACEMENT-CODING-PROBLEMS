#include<stdio.h>

int main()
{
    int num, a=1, b =1, total, i;
    printf("Enter the number: ");
    scanf("%d", &num);

    if(num==1)
    {
        printf("Fibbonaci Series is: 0 ");
    }
    else if(num==2)
    {
        printf("Fibbonaci Series is: 0 1 ");
    }
    else{
        printf("Fibbonaci Series is: 0 1 1 ");
        for(i=1; i<=num-3; i++)
        {
            total = a+b;
            b = a;
            a = total;
            printf("%d ", total);
        }
    }

}