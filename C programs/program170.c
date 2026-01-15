#include<stdio.h>

int CountCapital(char *str)
{
    int iCount = 0;
    while(*str != '\0')
    {
        if((*str >= 65) && (*str <= 90))
        {
            str++;
            iCount++;
        }
    }
   return iCount;


}
int main()
{
    int iRet = 0;
    char Arr[50] = {'\0'};

    printf("Enter String :");
    scanf("%[^'\n']s",Arr);

    iRet = CountCapital(Arr);

    printf("Number of Capital characters are :%d",iRet);
    printf("\n");

    
    return 0;
}