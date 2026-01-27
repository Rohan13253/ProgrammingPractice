#include<stdio.h>
#include<stdbool.h>

bool ChekPallindrom(char *str)
{
    
    char *start = NULL;
    char *End = NULL;
    char temp  = '\0';
    bool bflag = true;
    
    start = str;
    End = str;

    while(*str != '\0')
    {
        str++;
    }
    str--;
    End = str;

    while(start < End)
    {
        if(*start != *End)
        {
            bflag = false;
            break;
        }
        start++;
        End--;
    }
   
   
}

int main()
{
    bool bRet = 0;
    char cValue = '\0';
    char Arr[50] = {'\0'};

    printf("Enter String :\n");
    scanf("%[^'\n']s",Arr);

    strrevX(Arr);

    printf("String after reversal %s\n",Arr);

    return 0;
}

// Order of O(n/2)