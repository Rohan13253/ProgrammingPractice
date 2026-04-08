
// abcdef 
// fedcba
import java.util.*;
public class program529
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string: ");

        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println(sb);
    }
}
