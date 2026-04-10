
// abcdef hijk
// gfedcba kjih
import java.util.*;
public class program531
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string: ");

        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String tokens[] =str.split(" ");

        StringBuilder sb = null;

        StringBuilder newStr = new StringBuilder();

        for( String s : tokens)
        {
            sb = new StringBuilder(s);
            newStr.append(sb.reverse()); //newStr = newStr + sb.reverse();
            newStr.append(" ");
        }

        String finalStr = new String(sb);

        System.out.println(finalStr.trim());
    }
}
