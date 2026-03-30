
import java.util.*;
public class program521
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string: ");

        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String tokens[]  = str.split(" ");

        int iMax = 0;
        String MaxStr = null;
        int i = 0;
        
        for(i = 0;i < tokens.length ; i++)
        {
            if(iMax < tokens[i].length())
            {
                iMax = tokens[i].length();
                MaxStr = tokens[i];
            }
            
        }
        System.out.println(MaxStr+" : "+iMax);
    }
}
