// Input : 4
// Output : -4 -3 -2 -1 0 1 2 3 4


#include<stdio.h>
void Display(int iNo,char ch)
{
    int iCnt = 0;
    
    if( iNo < 0)
    {
        iNo = - iNo;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("%c\t",ch);
    }
    printf("\n");
}



int main()
{
    int iValue = 0;
    char cValue = '\0';

    printf("Enter the frequency :\n");
    scanf("%d",&iValue);

    printf("Enter Character :\n");
    scanf("%c",&cValue);
    printf("Accpted Character :%c\n",cValue);
    Display(iValue,cValue);

    return 0;
}

// Time Complexity : O(N)
// N is natural number
// Where N >= 0 and N <= Infinity