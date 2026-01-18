#include<stdio.h>

void CountCapitalSmallDigit(char *str)
{
    int iCountSmall = 0;
    int iCountCap = 0;
    int iCountDigit = 0;

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
        else if((*str >= '0') && (*str <= '9'))
        {
            iCountDigit++;
        }

        str++;
    }
    printf("Number of Small Characracter are : %d\n",iCountSmall);
    printf("Number of Capital Characracter are : %d\n",iCountCap);
    printf("Number of Digit Characracter are : %d",iCountDigit);
   

}
int main()
{
    
    char Arr[50] = {'\0'};

    printf("Enter String :");
    scanf("%[^'\n']s",Arr);

    CountCapitalSmallDigit(Arr);

    printf("\n");

    
    return 0;
}