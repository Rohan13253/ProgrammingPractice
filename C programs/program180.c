#include<stdio.h>

void struprX(char *str)
{
    
    while(*str != '\0')
    {
        if((*str >= 'A') && (*str <= 'Z'))
        {
            *str = *str + 32;
             // *str = *str + ('a' - 'A');
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

    struprX(Arr);

    printf("Updated string :%s\n",Arr);
    return 0;
}