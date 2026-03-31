// demo hello pune demo code hello india ppa lb hello
/*.  
 * -------------
 *  key.  value
 * -------------
 *  demo.  2
 *  hello  3
 *  pune   1
 *  code   1
 *  india  1
 * 
 * 
 *  Acccept string 
 *  remove extra whitespaces using trim
 *  tokenise the string using split
 *  create hashmap with string as key and int as value
 *  tarvel token array and update hashamap
 *  travel hashmap and display result
 * 
 */

import java.util.*;
public class program524
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string: ");

        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String tokens[]  = str.split(" ");

        HashMap<String , Integer> hobj = new HashMap<String , Integer>();

        for(String s : tokens)
        {
            if(hobj.containsKey(s))
            {
                hobj.put(s,hobj.get(s)+1);
            }
            else
            {
                hobj.put(s,1 );
            }
        }

        for(String s: hobj.keySet())
        {
            System.out.println(s +" : "+hobj.get(s));
        }
    }
}
