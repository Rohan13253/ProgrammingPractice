#include<stdio.h>
#include<stdbool.h>

bool ChekCharacter(char *str,char ch)
{
    bool bFlag = false;
       
    while(*str != '\0')
    {
       if(*str == ch)
       {
        bFlag = true;
        break;
       }
        str++;
    }
    return bFlag;
}

int main()
{
    bool bRet = 0;
    char cValue = '\0';
    char Arr[50] = {'\0'};

    printf("Enter String :");
    scanf("%[^'\n']s",Arr);

    
    printf("Enter Charecter :");
    scanf(" %c",&cValue);

    bRet = ChekCharacter(Arr,cValue);

    if(bRet == true)
    {
        printf("%c present in %s\n",cValue,Arr);
    }
    else
    {
        printf("%c is not present in  %s\n",cValue,Arr);
    }
    

    return 0;
}