import java.util.*;

class program495
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String str = sobj.nextLine();

        int Count[] = {0,0,0};
        int i = 0;
        char Arr[] = str.toCharArray();


        for(i = 0; i < Arr.length ;i++)
        {
            if(Arr[i]=='a'|| Arr[i]=='b' || Arr[i]=='c')
            {
               Count[Arr[i]-'a']++;
            }
            
        }

        System.out.println("aCount : "+Count[0]);
        System.out.println("bCount : "+Count[1]);
        System.out.println("cCount : "+Count[2]);

    }    
}
