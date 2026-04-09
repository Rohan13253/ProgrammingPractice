
// abcdef hijk
// gfedcba kjih
import java.util.*;
public class program530
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string: ");

        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String tokens[] =str.split(" ");

        StringBuffer sb = null;
        
        for( String s : tokens)
        {
            sb = new StringBuffer(s);

            System.out.println(sb.reverse());
        }
    }
}
