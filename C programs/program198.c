#include<stdio.h>
#include<stdbool.h>

void ReverseDisplay(char *str)
{
    int iCount = 0;
    int iCnt = 0;
    char *start = NULL;

    start = str ;

    while(*str != '\0')
    {
        iCount++;
        str++;
    }
     str--;
    
    while( str >= start )
    {
        printf("%c",*str);
        str--;
    }
    printf("\n");

}

int main()
{
    bool bRet = 0;
    char cValue = '\0';
    char Arr[50] = {'\0'};

    printf("Enter String :");
    scanf("%[^'\n']s",Arr);

    ReverseDisplay(Arr);
    return 0;
}