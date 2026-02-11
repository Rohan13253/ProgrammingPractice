import java.util.*;

class program479 
{
    public static void main(String[] args) 
    {
        int i = 0, iCount = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String str = sobj.nextLine();

        for(i = 0;i < str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                iCount++;
            }
        }

        System.out.println("Number of whiteSpaces are "+iCount);
    }    
}
