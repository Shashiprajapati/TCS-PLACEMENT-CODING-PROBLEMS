#include<stdio.h>

int main()
{
    char s[100];
    printf("Enter the String: ");
    // scanf("%s", s);
    gets(s);

    strrev(s);
    printf("Reverse of the string is: %s \n", s);
    return 0;

}