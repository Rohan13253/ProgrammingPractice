#include<stdio.h>

int CountSpace(char *str)
{
    int iCount = 0;
    while(*str != '\0')
    {
        if(*str == ' ')
        {
            
            iCount++;
        }
        str++;
    }
   return iCount;


}
int main()
{
    int iRet = 0;
    char Arr[50] = {'\0'};

    printf("Enter String :");
    scanf("%[^'\n']s",Arr);

    iRet = CountSpace(Arr);

    printf("Number of White Space are :%d",iRet);
    printf("\n");

    
    return 0;
}