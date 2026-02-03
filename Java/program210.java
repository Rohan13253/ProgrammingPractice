import java.util.Scanner;

class MarvellousString
{
    public int CountSmall(String str)
    {
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
        return iCount;
    }
}

class program210 
{
    public static void main(String A[] ) 
    {
        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = Sobj.nextLine();

        MarvellousString mobj = new MarvellousString();

        int iRet = 0;

        iRet = mobj.CountSmall(str);

        System.out.println("Number of small characters are :"+ iRet);
    }
}
