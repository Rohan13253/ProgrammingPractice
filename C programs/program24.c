#include<stdio.h>

int Sumation(int iNo)
{
    int sum = 0 ;
    int i =0;
    for(i = 1;i<=iNo;i++)
    {
        sum = sum +i;
        
    }
    return sum;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number :");
    scanf("%d",&iValue);

    iRet = Sumation(iValue);
    printf("%d",iRet);
    
    return 0;
}