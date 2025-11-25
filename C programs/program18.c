#include<stdio.h>



int Calculate(int iNo)
{
    int iCnt = 0, iSum = 0;

   for(iCnt = 1; iCnt <= iCnt; iCnt++ )
   {
    iSum = iSum + iCnt;
   }
   return iSum;
}


int main()
{
    int iFrequency = 0 ;
    int iRet =0;

    printf("Enter Frequency : ");
    scanf("%d",&iFrequency);
    iRet =Calculate(iFrequency);
    printf("sumation is :%d\n",iRet);
   
    return 0;
}