import java.util.Scanner;

class MarvellousString
{
    public String str;

    public MarvellousString(String a)
    {
        this.str = a;
    }
    public int CountSmall()
    {
        char Arr[] = str.toCharArray();

        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0 ; iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
               iCount++;
            }
        }
        return iCount;
    }

    public String UpdateString()
    {
         char Arr[] = str.toCharArray();

        int iCnt = 0;
        
        for(iCnt = 0 ; iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
               Arr[iCnt] = '#';
            }
        }
        String ret = new String(Arr);
        return ret;
    }
}

class program214 
{
    public static void main(String A[] ) 
    {
        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String data = Sobj.nextLine();

        MarvellousString mobj = new MarvellousString(data);

        String sRet = null;
        

        sRet = mobj.UpdateString();

        System.out.println("Updated String : " + sRet);
    }
}
