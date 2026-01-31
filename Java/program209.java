import java.util.Scanner;

class program209 
{
    public static void main(String A[] ) 
    {
        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = Sobj.nextLine();

        char Arr[] = str.toCharArray();

        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0 ; iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
               iCount++;
            }
        }
         System.out.println("Number of small characters are :"+ iCount);
    }
}
