#include<stdio.h>

int CountDigit(int iNo)
{
    int iDigit = 0;
    int iSum = 0;

    
    while(iNo != 0)
    {
        iDigit = iDigit % 10;
        iNo = iNo /10;
        iSum = iSum + iDigit;

    }

    return iSum;
}


int main()
{
    int iValue = 0;
    int iDigit = 0 ;
    int iRet = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    iRet = CountDigit(iValue);
    printf("%d",iRet);
    printf("\n");


    return 0;
}