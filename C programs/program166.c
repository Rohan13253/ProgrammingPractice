#include<stdio.h>

int strlenX(char *str)
{
    int iCount = 0;
    while(*str != '\0')
    {
        str++;
        iCount++;

    }
   return iCount;


}
int main()
{
    int iRet = 0;
    char Arr[50] = {'\0'};

    printf("Enter String :");
    scanf("%[^'\n']s",Arr);

    iRet = strlenX(Arr);

    printf("Number of characters are :%d",iRet);
    printf("\n");

    
    return 0;
}