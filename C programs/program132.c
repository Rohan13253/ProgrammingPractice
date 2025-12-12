#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool Search(int Arr[],int iSize)
{
    int iCnt = 0;
    bool bValue = false;
    for(iCnt = 0 ; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == 11)
        {
           bValue =  true;
           break;
        }
       
    }
    return bValue ;
}
int main()
{
    int iLength = 0,iCnt =0;
    bool bRet = 0;
    int *ptr = NULL;

    printf("Enter the NUmber of the Element :\n");
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
    bRet = Search(ptr,iLength);
    if(bRet == true)
    {
        printf("11 is present");
    }
    else
    {
        printf("11 is not present");
    }
    // Step 3: Free the memory
    free(ptr);
   
    
    return 0;
}