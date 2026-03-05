
import java.util.*;
public class program514 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string: ");

        String str = sobj.nextLine();

        str = str.trim();

        str.replaceAll("ab", "x");

        System.out.println(str);
    }
}
