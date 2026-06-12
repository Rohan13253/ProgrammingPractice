#include<iostream>
using namespace std ;

typedef unsigned int UINT;

UINT OffBitMultiple(UINT iNo,UINT iPos ,UINT iPos2) // 4th and 7th
{
    UINT iMask = 1;
    UINT iMask1 = 1;
    UINT iMask2 = 1;

    UINT iResult = 0;

    iMask1 = iMask1 << (iPos1 - 1);
    iMask2 = iMask2 << (iPos2 - 1);

    iMask1 = ~iMask1;
    iMask2 = ~iMask2;

    iMask = iMask1 & iMask2;


    iResult = iNo & iMask;
    
    
   return iResult;
    

}

int main()
{
    
    UINT iValue = 0;
    UINT iLocation1 = 0;
    UINT iLocation2 = 0;
    UINT iRet = 0;

    cout<<"Enter the number :\n";
    cin>>iValue;

    cout<<"Enter the number :\n";
    cin>>iLocation1;

    cout<<"Enter the number :\n";
    cin>>iLocation2;

    iRet = OffBitMultiple(iValue,iLocation1,iLocation2);

    cout<<"Updated number is :"<<iRet<<"\n";

    return 0;
}