#include<stdio.h>
#include<stdbool.h>

int main()
{
    int num, i;
    bool flag =true;
    printf("Enter the number: ");
    scanf("%d", &num);

    if(num > 1)
    {
        for(i=2; i<=num/2; i++)
        {
            if(num%i==0)
            {
                flag = false;
                break;
            }
        }
    }

    if(flag==false)
    {
        printf("The number is not Prime");
    }
    else{
        printf("The number is Prime");
    }

}