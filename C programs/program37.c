#include<stdio.h>

int DisplayEvenFactor(int iNo)
{
    
    int iCnt =0;

    if(iNo < 0) // Upadator
    {
        iNo = -iNo;
    }

    if(iNo < 0)
    {
        printf("Enter Valid number");
    }

    for(iCnt = 0; iCnt <= (iNo/2);iCnt++)
    {
       if((iNo % iCnt) == 0 && ((iCnt%2) == 0 ))
       {
        printf(" %d",iCnt);
       }
        
    }
    printf("\n");
    return iCnt;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number :");
    scanf("%d",&iValue);

    DisplayEvenFactor(iValue);
    
    return 0;
}