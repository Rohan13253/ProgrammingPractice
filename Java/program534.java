
// hello demo  nayan madam  ppa level for radar
// nayan madam level radar

import java.util.*;
public class program534
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter word : ");

        String str = sobj.nextLine();
        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String tokens[] = str.split(" ");

        StringBuilder sb = null;


        for(String s : tokens)
        {
            sb = new StringBuilder(s);

            sb.reverse();

            if(s.equals(new String(sb)))
            {
                System.out.println(s);
            }
        }

        
    }
}
