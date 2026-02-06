import java.util.Scanner;

import MarvellousLB.MarvellousString;

class program213 
{
    public static void main(String A[] ) 
    {
        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String data = Sobj.nextLine();

        MarvellousString mobj = new MarvellousString(data);

        mobj.str= data;
        int iRet = 0;

        iRet = mobj.CountSmall();

        System.out.println("Number of small characters are :"+ iRet);
    }
}
