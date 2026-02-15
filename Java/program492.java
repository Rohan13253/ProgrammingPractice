import java.util.*;

class program492 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String str = sobj.nextLine();

        int aCount = 0, bCount = 0 , cCount = 0,i = 0;;
        char Arr[] = str.toCharArray();


        for(i = 0; i < Arr.length ;i++)
        {
            if(Arr[i]=='a')
            {
                aCount++;
            }
            else if(Arr[i]=='b')
            {
                bCount++;
            }
            else if(Arr[i]=='c')
            {
                cCount++;
            }
        }

        System.out.println("aCount : "+aCount);
        System.out.println("bCount : "+bCount);
        System.out.println("cCount : "+cCount);
    }    
}
