#include<stdio.h>

void Change(char *str)
{
    
    while(*str != '\0')
    {
        if(*str == 'a')
        {
            *str = 'A';
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

    Change(Arr);

    printf("Updated string :%s\n",Arr);
    printf("\n");

    
    return 0;
}