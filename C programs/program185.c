#include<stdio.h>

// Case Sensentice
int charFrequency(char *str,char ch)
{
    int iCount = 0;
    
    while(*str != '\0')
    {
        if(*str == ch)
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
    char cValue = '\0';
    char Arr[50] = {'\0'};

    printf("Enter String :");
    scanf("%[^'\n']s",Arr);

    
    printf("Enter Charecter :");
    scanf(" %c",&cValue);

    iRet = charFrequency(Arr,cValue);

    printf("%c occurs %d times\n",cValue,iRet);

    return 0;
}