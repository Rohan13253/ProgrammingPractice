#include<stdio.h>

int CountSmall(char *str)
{
    int iCount = 0;
    while(*str != '\0')
    {
        if((*str >= 'a') && (*str <= 'z'))
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

    iRet = CountSmall(Arr);

    printf("Number of Small characters are :%d",iRet);
    printf("\n");

    
    return 0;
}