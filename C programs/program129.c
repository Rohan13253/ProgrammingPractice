#include<stdio.h>
#include<stdlib.h>

int CountOdd(int Arr[],int iSize)
{
    int iCnt = 0;
    int iCount = 0;
    for(iCnt = 0 ; iCnt < iSize; iCnt++)
    {
        if((Arr[iCnt] % 2) != 0)
        {
            iCount++;
        }
        
    }

    return iCount;
}
int main()
{
    int iLength = 0,iCnt =0, iRet = 0;
    int *ptr = NULL;

    printf("Enter the Number of the Element :\n");
    scanf("%d",&iLength);

    // Step 1: Allocate the memory
    ptr = (int *)malloc(iLength * sizeof(int));
    if(ptr == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter the element:\n");
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

   
    // Step 2: Use the memory
    iRet = CountOdd(ptr,iLength);
    printf("Total Odd Element are :%d\n",iRet);

    // Step 3: Free the memory
    free(ptr);
   
    
    return 0;
}