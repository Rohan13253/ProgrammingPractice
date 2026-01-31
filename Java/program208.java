import java.util.*;

class program208
{
    public static void main(String A[])
    {
        Scanner Sobj = new Scanner(System.in);
        int iCnt = 0;

        System.out.println("Enter String : ");
        String name= Sobj.nextLine();

        char Arr[] = name.toCharArray();

        System.out.println(Arr);

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    
    }
} 
    
