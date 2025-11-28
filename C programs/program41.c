#include<stdio.h>
#include<stdbool.h>

bool CheckPerfect(int iNo)
{   
    int iCnt = 0;
    int iSum = 0;
    bool bFlag = false;

    if(iNo <0 )
    {
        iNo = -iNo;
    }

    for(iCnt =1 ; iCnt<= (iNo/2); iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            iSum = iSum + iCnt;
        }
    }
    if(iSum == iNo)
    {
        bFlag = true;
    }
    return bFlag;
}


int main()
{
    int iValue = 0;
    bool bRet = 0;


    printf("Enter the Number:");
    scanf("%d",&iValue);

    bRet = CheckPerfect(iValue);

    if(bRet == true)
    {
        printf("%d  is perfect",iValue);
    }
    else if( bRet == false)
    {
        printf(" %d is not a perfect number",iValue);
    }


    return 0;
}