#include<iostream>
using namespace std ;

typedef unsigned int UINT;

UINT ChangeBit(int iNo,int iPos)
{
    UINT iMask = 1;
    UINT iResult = 0;

    iMask = iMask << (iPos - 1);
    iMask = ~ iMask;

    iResult = iNo & iMask;
    
   return iResult;
    

}

int main()
{
    
    UINT iValue = 0;
    UINT iLocation = 0;
    UINT iRet = 0;

    cout<<"Enter the number :\n";
    cin>>iValue;

    cout<<"Enter the Loction  :\n";
    cin>>iLocation;

    iRet = ChangeBit(iValue,iLocation);

    cout<<"Updated number is :"<<iRet<<"\n";

    return 0;
}