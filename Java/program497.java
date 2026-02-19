import java.util.*;

class program497
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String str = sobj.nextLine();

        int Count[] = new int[26];
        int i = 0;
        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length ;i++)
        {
            
            Count[Arr[i]-'a']++;
            
        }

        for(i = 0; i< 26;i++)
        {
            if(Count[i] != 0)
            {
            // System.out.println(A+" Count : "+Count[i]);
            System.out.println("Frequency of "+(char)(i+'a')+" is : "+Count[i]);
            }
        }

    }    
}
