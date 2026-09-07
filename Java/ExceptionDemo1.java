//08-10-2025 division of 2 num
import java.util.*;

public class ExceptionDemo1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0;
        int iAns = 0;

        System.out.println("Enter first number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second number : ");
        iNo2 = sobj.nextInt();

        iAns = iNo1 / iNo2;
        System.out.println("Division is : "+iAns);
        
        iAns = iNo1 % iNo2;
        System.out.println("Reminder is : "+iAns);
    }    
}
