#include<iostream>
using namespace std;

void DisplayBinary(int iNo)
{
    int iCnt = 0;
    int iDigit = 0;

    cout<<"Binary convertion is :\n";

    while(iNo != 0) 
    {
        iDigit = iNo % 2;
        cout<<iDigit;
        iNo = iNo / 2;
    }
    cout<<endl;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    cout<<"Enter The number";
    cin>>iValue;

    DisplayBinary(iValue);
    return 0;
}