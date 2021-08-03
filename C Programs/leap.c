#include<stdio.h>
#include<stdbool.h>

int main()
{
    int num, i;
    bool flag = true;

    printf("Enter the Year: ");
    scanf("%d", &num);

    if(num%4==0)
    {
        if(num%100==0)
        {
            if(num%400==0)
            {
                flag = true;
            }
            else{
                flag = false;
            }
        }
        else{
            flag = true;
        }
    }
    else{
        flag = false;
    }

    if(flag==true)
    {
        printf("Input year is Leap Year\n");
    }
    else{
        printf("Input year is not a Leap Year\n");
    }

    return 0;
}