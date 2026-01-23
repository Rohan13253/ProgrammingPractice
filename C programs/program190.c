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

    
    
    while(*str != '\0')
    {
        if((ch >= 'a') && (ch <= 'z'))          // Small
        {
           if(*str == ch || *str == ch - 32)
            {
                iCount++;
            }

        }
        else if((ch >= 'A') && (ch <= 'Z'))     // Capital
        {
            if(*str == ch || *str == ch + 32)
            {
                iCount++;
            }
        }
        else                                    // Other(special char, digits and etc)
        {
            if((*str ==ch) || (*str == ch + 0)) // New part                        
            {
                iCount++;
            }
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