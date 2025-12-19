#include<stdio.h>
#include<string.h>

int main()
{
    int iRet = 0;
    char Arr[50] = {'\0'};

    printf("Enter String :");
    scanf("%[^'\n']s",Arr);

    iRet = strlen(Arr);

    printf("Number of characters are :%d",iRet);
    printf("\n");

    
    return 0;
}