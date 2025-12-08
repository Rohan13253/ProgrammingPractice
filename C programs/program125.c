#include<stdio.h>
#include<stdlib.h>

int main()
{
    int iLength = 0,iCnt =0;;
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

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        printf("Entered elements are :\n%d\ns",ptr[iCnt]);
    }
    // Step 2: Use the memory


    // Step 3: Free the memory
    free(ptr);
   
    
    return 0;
}