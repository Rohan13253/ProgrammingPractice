//08-10-2025 division of 2 num
import java.util.*;

public class ExceptionDemo7
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

        try
        {
            System.out.println("inside try block..");
            iAns = iNo1 / iNo2;
        }
        //System.out.println("Hello"); error
        catch(ArithmeticException aobj) //specific catch
        {
            System.out.println("inside catch block..");
            System.out.println(aobj);
        }
        catch(Exception eobj)       //generic catch
        {
            System.out.println("inside generic catch..");
        }
        finally
        {
            System.out.println("Inside finally block..");
        }

        System.out.println("Division is : "+iAns);
    }    
}
