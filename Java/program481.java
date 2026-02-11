import java.util.*;

class program481 
{
    public static void main(String[] args) 
    {
        int i = 0, iCount = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();
        for(i = 0;i < Arr.length;i++)
        {
            if(Arr[i]==' ')
            {
                Arr[i]= '_';
            }
        }

        String newstr = new String(Arr);
        System.out.println("Updates String is :"+newstr);
    }    
}
