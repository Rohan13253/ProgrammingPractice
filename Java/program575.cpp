#include<iostream>
using namespace std;

class ArrayX
{
    public:
        int *Arr;
        int iSize;

        ArrayX(int no)
        {
            iSize = no;
            Arr = new int[iSize];
        }
        ~ArrayX()
        {
            delete []Arr;
        }
        void Accept()
        {
            cout<<"Enter The Element : \n";
            int i = 0;
            for(i = 0; i< iSize; i++)
            {
                cin>>Arr[i];
            }
        }

        void Display()
        {
            cout<<"Element of The Array Are : \n";
            int i = 0;
            for(i = 0; i< iSize; i++)
            {
                cout<<Arr[i]<<"\t";
            }  
            cout<<"\n";
        }

        bool LinearSearch(int no)
        {
            int i = 0;
            bool bFlag = false;

            for(int i = 0; i < iSize ; i++)
            {
                if(Arr[i] == no)
                {
                    bFlag = true;
                    break;
                }

            }
            return bFlag;
        }

        bool BiDirectionalSearch(int no)
        {
            int iStart = 0;
            int iEnd = 0;
            bool bFlag = false;

            for(iStart = 0, iEnd < iSize-1;iStart <= iEnd ;iStart++,iEnd--)
            {
                if(Arr[iStart] == no || Arr[iEnd] == no)
                {
                    bFlag = true;
                    break;
                }

            }
            return bFlag;
        }
        
};

int main()
{
    int iLength = 0;
    cout<<"Enter the size of array";
    cin>>iLength;

    ArrayX *aobj = new Array(iLength);
    bool bRet = false;

    aobj->Accept();

    aobj->Display();
    
    bRet = aobj->BiDirectionalSearch(30);

    if(bRet == true)
    {
        cout<<"Element Is present\n";
    }
    else
    {
        cout<<"element is Not present\n";
    }

    delete aobj;

    return 0;
}