/////////////
//
//
//
//
//
//////////////
#include<stdio.h>
#define ERR_INVALID_AGE -1

int main()
{
    int iAge = 0 ;
    int TicketPrice = 0;

    printf("Please enter your age:\n");
    scanf("%d",&iAge);

    TicketPrice = TicketCalculator(iAge);
    

    if( TicketPrice == ERR_INVALID_AGE)
    {
        printf("Unable to calculate");
    }
    else{
        printf("Your ticket price is:%d\n",TicketPrice);
    }
    return 0;
}
int TicketCalculator (int Age)
{
    int price = 0 ;
    if(Age < 0)
    {
        return ERR_INVALID_AGE;
    }
    
    if((Age > 0) && (Age <= 5))
    {
        price = 0;
        //return price;
    }
    else if((Age < 5) && ( Age <= 18))
    {
        price = 700;
        //return price ;
    }
    else if((Age < 18) && ( Age <= 50))
    {
        price = 900;
        //return price ;
    }
    else if(Age > 50)
    {
        price = 500;
        //return price ;
    }
    return price;
}