
import java.util.*;
public class program513 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string: ");

        String str = sobj.nextLine();

        str = str.trim();

        str.replaceAll("  ", " ");

        System.out.println(str);
    }
}
