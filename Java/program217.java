import java.util.Scanner;

class NNumberX
{
    public int CountEven(int Arr[])
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
            {
                iCount++;
            }
            
        }
        return iCount;
    }
}
class program217 
{
    public static void main(String A[] ) 
    {
        int iCnt = 0;
        int iCount = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements :");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the element :");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
       
        NNumberX nobj = new NNumberX();

        iRet = nobj.CountEven(Arr);
        
        
        System.out.println("Number of Even elements are : "+iRet);
        Arr = null;
        sobj  = null;
    }
}
