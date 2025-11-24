/*

     Start
        Accpet percentage from user 
            If percentage is less than 0 and greater than 100
                Display invalid input 
            If Percenage is greater than o and less than 35
                Display as fail
            If percentage is greater than 35 and less than 50 
                Display as pass class
            If Perecentage is greater than 50 andles than 60 
                display as secound class
            If Perecentage is greater than 50 andles than 60
                display as First class
            If Perecentage is greater than 50 andles than 60
                display as first  class with distingtion
     Stop

*/

/////////////////////////////////////////////
//
//  Name :
//  
//
//
//
//
///////////////////////////////////////////////

#include<stdio.h>


void DisplayClass(float fPerc)
{
    if((fPerc < 0.0f) || (fPerc > 100.0f))
    {
        printf("Unable to proceed ad input is invalis \n");
        return;
    }

    if((fPerc >= 0.0f) && (fPerc < 35.0f))
    {
        printf("Your are fail \n");
    }
    else if ((fPerc >= 35.0f) && (fPerc <50.0f))
    {
        printf("Pass class \n");
    }
    else if ((fPerc >= 50.0f) && (fPerc < 60.0f))
    {
        printf("Secoud class \n");
    }
    else if ((fPerc >= 60.0f) && (fPerc < 70.0f))
    {
        printf("First Class \n");
    }
    else if ((fPerc >= 70.0f) && (fPerc <= 100.0f))
    {
        printf("First class with distintion \n");
    }
}
int main()
{
    float fValue = 0.0f;
    printf("Please enter your percentage:");
    scanf("%f",&fValue);

    DisplayClass(fValue);

    return 0;
}

