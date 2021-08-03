#include<stdio.h>
#include<stdbool.h>

int main()
{
    int max, lcm, num1, num2;
    printf("Enter 1st number: ");
    scanf("%d", &num1);
    printf("Enter 2nd number: ");
    scanf("%d", &num2);

    if(num1>num2)
    {
        max = num1;
    }
    else{
        max = num2;
    }

    while(true)
    {
        if((max%num1==0) && (max%num2==0))
        {
            lcm = max;
            break;
        }
        max++;
    }
    printf("The LCM is: %d", lcm);


}