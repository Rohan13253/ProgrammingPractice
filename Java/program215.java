import java.util.Scanner;

class program215 
{
    public static void main(String A[] ) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements :");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the element :");

        int iCnt = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
         System.out.println("Elments of Array are :");
        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
             System.out.println(Arr[iCnt]);
        }
       
        Arr = null;
        sobj  = null;
    }
}
