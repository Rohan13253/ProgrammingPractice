import java.util.*;

public class program507
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The  String : ");
        String str = sobj.nextLine();

       str = str.replaceAll(" ", "");

       HashMap <Character, Integer>hobj = new HashMap<Character,Integer>();

       char Arr[] = str.toCharArray();
       int Frequency = 0;

       for(char ch : Arr)
       {
            if(hobj.containsKey(ch)) // Character is already there in hashmap
            {
                Frequency = hobj.get(ch);
                hobj.put(ch,Frequency+1);
            }
            else // Character occured first time
            {
                hobj.put(ch,1);
            }

            
       }
        int iMax = 0;
        char cMax = '\0';

        for(char ch : hobj.keySet())
        {
            if( iMax < hobj.get(ch))
            {
                iMax = hobj.get(ch);
                cMax = ch;
            }
        }

        System.out.println("Maximum Occured character is "+cMax+" with frequency "+iMax);
         
    }    
}