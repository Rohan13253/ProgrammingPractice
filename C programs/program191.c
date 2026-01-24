#include<stdio.h>
// Input  : deRm2dfr
// Char   : R
// Output : 2 (Correct)

// Input  : Demo@23@re
// Char   : @
// Output : 0 

// Case inSensentice

int charFrequency(char *str,char ch)
{
    int iCount = 0;
    int iDisplacement = 0;

       if((ch >= 'a') && (ch <= 'z'))          
        {
           iDisplacement = -32;
        }
        else if((ch >= 'A') && (ch <= 'Z'))     
        {
           iDisplacement = 32;
        }
        else                             
        {
           iDisplacement = 0;
        }

    
    while(*str != '\0')
    {
        if((*str == ch) || (*str == ch + iDisplacement))
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