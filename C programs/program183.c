#include<stdio.h>

int charFrequency(char *str,char ch)
{
    int iCount = 0;
    
    while(*str != '\0')
    {
        

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

    // Problem deu to buffer Cleanup
    printf("Enter Charecter :");
    scanf("%c",&cValue);

    iRet = charFrequency(Arr,cValue);

    printf("Updated string :%d\n",iRet);
    return 0;
}