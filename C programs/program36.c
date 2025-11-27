#include<stdio.h>

int DisplayFactor(int iNo)
{
    
    int iCnt =0;

    if(iNo < 0) // Upadator
    {
        iNo = -iNo;
    }
    for(iCnt = 0; iCnt < iNo ;iCnt++)
    {
       if((iNo % iCnt) == 0)
       {
        printf("Factors is %d\n",iCnt);
        
       }
       else
       {
        printf("Non factor is :%d",iCnt);
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

    DisplayFactor(iValue);
    
    return 0;
}