#include<stdio.h>
#include<stdbool.h>

bool CheckEven(int iNo)
{
    bool bResult = false;

    if((iNo % 2) == 0) // Logic for even || odd
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

    bRet = CheckEven(iValue);
    if(bRet == true)
    {
        printf("%d is Even number",iValue);
    }
    else
    {
        printf("%d is Odd number",iValue);
    }

    return 0;
}