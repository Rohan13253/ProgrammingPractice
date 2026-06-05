#include<iostream>
using namespace std ;

typedef unsigned int UINT;

UINT ChangeBit(int iNo)
{
    UINT iMask = 4294965247;
    UINT iResult = 0;

    iResult = iNo & iMask;

    return iResult;
    
}

int main()
{
    
    UINT iValue = 0;
   
    int iRet = 0;

    cout<<"Enter the number :\n";
    cin>>iValue;

    iRet = ChangeBit(iValue);

    cout<<"Undated number is :"<<iRet<<"\n";
   

    return 0;
}