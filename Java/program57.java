import java.util.*;

class Arithmatic
{
    public int Addition(int iNo1 , int iNo2)
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }
    
}
public class program57 
{

    
    public static void main(String A[]) 
    {
        int iValue1 = 0, iValue2 = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter fist number");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Secound number");
        iValue2 = sobj.nextInt();
        
        Arithmatic pobj = new Arithmatic();
        iRet = pobj.Addition(iValue1, iValue2);
        System.out.println("addition is " +iRet);
    }
}
