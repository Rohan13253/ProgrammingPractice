#include<stdio.h>

int main()
{
    int iNo = 0;
    int iDigit = 0 ;

    iDigit = iNo % 10;
    printf("%d\n",iDigit);
    iNo = iNo/ 10;
    printf("Updaterd iNo : %d\n",iNo);   // 1

    iDigit = iNo % 10;
    printf("%d\n",iDigit);
    iNo = iNo/ 10;
    printf("Updaterd iNo : %d\n",iNo);

    iDigit = iNo % 10;
    printf("%d\n",iDigit);
    iNo = iNo/ 10;
    printf("Updaterd iNo : %d\n",iNo);


    return 0;
}