#include<iostream>
using namespace std ;

bool CheckBit(int iNo)
{
    unsigned int iMask = 0x04000000;  // 27th Position 
    unsigned int iResult = 0;

    iResult = iNo & iMask;
    
   return (iResult == iMask);
    
}

int main()
{
    
    unsigned int iValue = 0;
    bool bRet = 0;

    cout<<"Enter the number :\n";
    cin>>iValue;

    bRet = CheckBit(iValue);

    if(bRet == true)
    {
        cout<<"27th Bit is ON\n";
    }
    else
    {
        cout<<"27th Bit is OFF\n";
    }
    

    return 0;
}
