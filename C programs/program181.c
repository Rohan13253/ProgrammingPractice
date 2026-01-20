#include<stdio.h>

void strtoggle(char *str)
{
    
    while(*str != '\0')
    {
        if((*str >= 'A') && (*str <= 'Z'))
        {
            *str = *str + 32;
        }
        else if((*str >= 'a') && (*str <= 'z'))
        {
            *str = *str - 32;
        }

        str++;
    }

}
int main()
{
    int iRet = 0;
    char Arr[50] = {'\0'};

    printf("Enter String :");
    scanf("%[^'\n']s",Arr);

    strtoggle(Arr);

    printf("Updated string :%s\n",Arr);
    return 0;
}