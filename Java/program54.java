import java.util.*;
public class program54 {
    

    public static void main(String A[])
    {

        Scanner sobj = null;
        int iNo1 =0;
        int iNo2 =0;
        int iSum;
        sobj = new Scanner(System.in);

        System.err.println("Enter number :");
        iNo1 = sobj.nextInt();

        System.err.println("Enter number :");
        iNo2 = sobj.nextInt();

        iSum = iNo1 + iNo2 ;

        System.out.println(iSum);


    }
}
