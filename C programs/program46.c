#include<stdio.h>

void DisplayDigit(int iNo)
{
    int iDigit = 0;
    
    while(iNo != 0)
    {
        iDigit = iDigit % 10;
        printf("%d",iDigit);
        iNo = iNo /10;

    }
}


int main()
{
    int iValue = 0;
    int iDigit = 0 ;

    printf("Enter number :");
    scanf("%d",&iValue);

    DisplayDigit(iValue);

    return 0;
}