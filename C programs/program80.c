// Input : 4
// Output : 
// 1
// 2
// 3
// 4



#include<stdio.h>
void Display(int iNo)
{
    int iCnt = 0;
    
    if( iNo < 0)
    {
        iNo = - iNo;
    }

    for(iCnt = iNo; iCnt >= 1; iCnt--)
    {
        printf("%d \n",iCnt);
    }
}



int main()
{
    int iValue = 0;

    printf("Enter the frequency :\n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}

// Time Complexity : O(N)
// N is natural number
// Where N >= 0 and N <= Infinity