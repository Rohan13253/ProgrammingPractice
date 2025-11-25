#include<stdio.h>
// Itereation 


void Display(int value)
{
    int iCnt = 0;

   for(iCnt = 1; iCnt <= 4; iCnt++ )
   {
    printf("%d\n",value);
   }
}


int main()
{
    int value = 0 ;
    int Displayvalue =0;

    printf("Enter value");
    scanf("%d",&value);
    Display(value);
   
    return 0;
}