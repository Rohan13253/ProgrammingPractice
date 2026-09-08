//08-10-2025 division of 2 num
import java.util.*;

public class ExceptionDemo2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0;
        float fAns = 0;

        System.out.println("Enter first number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second number : ");
        iNo2 = sobj.nextInt();

        fAns = (float)iNo1 / (float)iNo2; //explicite type casting..
        System.out.println("Division is : "+fAns);
        
        fAns = iNo1 % iNo2;
        System.out.println("Reminder is : "+fAns);
    }    
}
