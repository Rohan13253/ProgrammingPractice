import java.util.*;

class StringX
{
    public String Replace(String str ,char A,char B)
    {
        int i = 0, iCount = 0;
        char Arr[] = str.toCharArray();
        for(i = 0;i < Arr.length;i++)
        {
            if(Arr[i]== A)
            {
                Arr[i]= B;
            }
        }

        String newstr = new String(Arr);
        System.out.println("Updates String is :"+newstr);
        return newstr;
    }
}
class program483 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String str = sobj.nextLine();

        StringX strobj = new StringX();

        String sRet = strobj.Replace(str, 'A', 'B');

        System.out.println("Updated String: "+sRet);
        
    }    
}
