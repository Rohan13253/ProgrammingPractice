#include<iostream>
using namespace std;

int CountZero(int iNo)
{
    int iCnt = 0;
    int iDigit = 0;

    while(iNo != 0) 
    {
        iDigit = iNo % 2;
        iNo = iNo / 2;
        if(iDigit == 0)
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

    iRet = CountZero(iValue);
    cout<<"Number of zero in binay is :\n";
    cout<<iRet<<"\n";
    return 0;
}