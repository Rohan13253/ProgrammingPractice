#include<stdio.h>
#include<stdbool.h>

void ReverseDisplay(char *str)
{
    int iCount = 0;
    int iCnt = 0;

    while(*str != '\0')
    {
        iCount++;
        str++;
    }
     str--;
    iCnt = iCount;
    
    while( iCnt > 0 )
    {
        printf("%c",*str);
        iCnt--;
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