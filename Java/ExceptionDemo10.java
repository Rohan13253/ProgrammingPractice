import java.util.*;

public class ExceptionDemo10
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {10,20,30,40,50};
        int iIndex = 0, iData = 0;

        System.out.println("Enter index number : ");
        iIndex = sobj.nextInt();

        if(iIndex > 5)
        {
            System.out.println("invalid index");
        }
        try
        {
            System.err.println("inside try..");
            iData = Arr[iIndex];
        }
        catch(Exception eobj)
        {
            System.out.println("inside catch..(barik jaali)");
            System.out.println(eobj);
        }
        finally
        {
            System.out.println("Inside finally..");
        }

        System.out.println("Element at that index is : "+iData);
    }    
}
