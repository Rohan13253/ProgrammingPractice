#include<iostream>
using namespace std;

int CountOne(int iNo)
{
    int iCnt = 0;
    int iDigit = 0;

    while(iNo != 0) 
    {
        iDigit = iNo % 2;
        iNo = iNo / 2;
        if(iDigit == 1)
        {
            iCnt++;
        }
    }
    cout<<endl;
    return iCnt;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    cout<<"Enter The number :\n";
    cin>>iValue;

    iRet = CountOne(iValue);
    cout<<"Number of ones in binay is :\n";c
    cout<<iRet;
    return 0;
}