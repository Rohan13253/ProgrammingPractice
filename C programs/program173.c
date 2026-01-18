#include<stdio.h>

void CountCapitalSmall(char *str)
{
    int iCountSmall = 0;
    int iCountCap = 0;

    while(*str != '\0')
    {
        if((*str >= 'a') && (*str <= 'z'))
        {
            
            iCountSmall++;
        }
        else if((*str >= 'A') && (*str <= 'Z'))
        {
            iCountCap++;
        }

        str++;
    }
    printf("Number of Small Characracter are : %d\n",iCountSmall);
    printf("Number of Capital Characracter are : %d",iCountCap);
   

}
int main()
{
    
    char Arr[50] = {'\0'};

    printf("Enter String :");
    scanf("%[^'\n']s",Arr);

    CountCapitalSmall(Arr);

    printf("\n");

    
    return 0;
}