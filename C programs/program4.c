/////////////////////////////////////////////////
//
//  File name :   Program2.c
//  Description : Used to calculatepercentage
//  Author :      Rohan M pawar
//  Date :        28/04/2025
//
/////////////////////////////////////////////////

/// Dynamic code

#include<stdio.h>
int main()
{
    int Total = 0;
    int Obtained = 0;
    float Percentage = 0.0f;
   
    printf("Enter your total marks : \n");
    scanf("%d",&Total);

    printf("Enter your total marks : \n");
    scanf("%d",&Obtained);

    Percentage = ((float)Obtained / (float)Total) * 100;

    printf("Percentage is : %.2f%%\n",Percentage);
    return 0;
}