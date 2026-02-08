import java.util.Scanner;

class NNumberX
{
    public int Arr[];

    public NNumberX(int iSize)
    {
        Arr = new int[iSize];
    }
    public int CountEven()
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
class program218 
{
    public static void main(String A[] ) 
    {
        int iCnt = 0;
        int iCount = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements :");
        int iSize = sobj.nextInt();

        
        NNumberX nobj = new NNumberX(iSize);

        System.out.println("Enter the element :");

        for(iCnt = 0 ; iCnt < nobj.Arr.length ; iCnt++)
        {
            nobj.Arr[iCnt] = sobj.nextInt();
        }
       
       

        iRet = nobj.CountEven();
        
        
        System.out.println("Number of Even elements are : "+iRet);
        
        sobj  = null;
    }
}
