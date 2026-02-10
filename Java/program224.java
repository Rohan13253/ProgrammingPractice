import java.util.Scanner;

class ArrayX
{
    protected int Arr[];                  // Private

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];           // Resource Allocation
        System.out.println("Allocating the resources...");
    }

    protected void finalize()
    {
        Arr = null;
        System.out.println("Deallocating the resources...");
    }

    public void Accept()
    {
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the element :");
        for(iCnt = 0 ; iCnt < this.Arr.length ; iCnt++)
        {
            this.Arr[iCnt] = sobj.nextInt();
        }
        sobj = null;

    }
    public void Display()
    {
        int iCnt = 0;
        System.out.println("Entered elements :");

        for(iCnt = 0 ; iCnt < this.Arr.length ; iCnt++)
        {
           System.out.println(this.Arr[iCnt]);
        }

    }
}

class NNumberX extends ArrayX
{
    public NNumberX(int iSize)
    {
        super(iSize);
    }
    public int CountEven()
    {
       
        int iCount = 0;
        int iCnt = 0;

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
class program224 
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

        nobj.Accept();

        nobj.Display();
        
        iRet = nobj.CountEven();
        
        
        System.out.println("Number of Even elements are : "+iRet);
        
        sobj  = null;

        nobj = null;

        System.gc();
    }
}
