
// abcdef hijk
// gfedcba kjih
import java.util.*;
public class program533
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter word : ");

        String str = sobj.nextLine();

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        if(str.equals(new String(sb)))
        {
            System.out.println("String is Palindrom");
        }
        else
        {
            System.out.println("String is NOT Palindrom");
        }
    }
}
