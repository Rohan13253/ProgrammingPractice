import java.util.*;

class StringX
{
    public static String Trim(String str)
    {
        int i = 0, iStart = 0,iEnd = 0;;
        char Arr[] = str.toCharArray();//_ _ _JAY_ _GANESH_ _ _
        
        if(Arr[0]== ' ')
        {
            while((Arr[i] == ' ') && (i < Arr.length))
            {
                i++;
            }
        }

        iStart = i;

        i = 0;

        i = Arr.length - 1;

        if(Arr[Arr.length-1] == ' ')
        {   
            while(Arr[i] == ' ')
            {
                i--;
            }
        }

        iEnd = i;
        //String(Arrat_Name, Starting_index, Count)
        return new String(Arr,iStart,iEnd-iStart+1);
    }
}

class program491 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String str = sobj.nextLine();

        String sRet = str.replaceAll(" ","");

        System.out.println("Updated string is :"+sRet);
        System.out.println("Updated string length is :"+sRet.length());

    }    
}
