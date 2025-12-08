#include<stdio.h>
int Summation(int ptr[],int iSize)
{
    
    int iCnt = 0;
    int iSum =0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
       iSum = iSum + ptr[iCnt];
    }

    return iSum;
    

}
int main()
{
    int Arr[5];
    int iCnt = 0;
    int iRet = 0;
    printf("Enter the Elements:\n");


    for(iCnt =0; iCnt < 5 ; iCnt++)
    {
        scanf("%d",&Arr[iCnt]);
    }

    iRet = Summation(Arr,5); // Display(100,5)
    printf("Summation of element of the Array are : %d",iRet);
    printf("\n");
    
    return 0;
}