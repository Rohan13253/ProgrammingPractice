#include<iostream>
using namespace std ;

typedef unsigned int UINT;

bool CheckBit(int iNo,int iPos)
{
    UINT iMask = 1;
    UINT iResult = 0;

    if(iPos <= 0 || iPos >32)
    {
        cout<<"Invalid Bit position\n";
        return false;
    }

    iMask = iMask << (iPos - 1);

    iResult = iNo & iMask;
    
   return (iResult == iMask);
    

}

int main()
{
    
    UINT iValue = 0;
    UINT iLocation = 0;
    bool bRet = 0;

    cout<<"Enter the number :\n";
    cin>>iValue;

    cout<<"Enter the Loction  :\n";
    cin>>iLocation;

    bRet = CheckBit(iValue,iLocation);

    if(bRet == true)
    {
        cout<<"Bit is ON at location "<<iLocation<<"\n";
    }
    else
    {
        cout<<"Bit is OFF at location "<<iLocation<<"\n";
    }
    

    return 0;
}