#include<stdio.h>
#include<stdbool.h>

bool CheckDivisible(int iNo)
{
    bool bResult = false;

    if((iNo % 5) == 0) 
    {
        bResult = true;
    }
    else
    {
        bResult = false;
    }
    return bResult;
    
}

int main()
{
    int iValue = 0;
    bool bRet = false ;

    printf("Enter Number :");
    scanf("%d",&iValue);

    bRet = CheckDivisible(iValue);
    if(bRet == true)
    {
        printf("%d is divisiable 5",iValue);
    }
    else
    {
        printf("%d is not divisiable by 5",iValue);
    }

    return 0;
}