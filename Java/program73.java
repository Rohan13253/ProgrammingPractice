import java.util.*;
class Digits
{
    public int Reverse(int iNo)
    {
        int iDigits =0;
        int iCnt = 0;
        int iRev = 0;
         if(iNo <0)
         {
            iNo = -iNo;
         }
        while(iNo != 0)
        {
            iDigits = iNo %10;
            iRev = iRev * 10 + iDigits;
            iNo = iNo / 10;

        }
        return iRev;

    }
}
public class program73 {
    public static void main(String[] args) {
        
        int iValue = 0;
        int iRet = 0;
       
        System.out.println("Enter number");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        

        iRet = dobj.Reverse(iValue);
        System.out.println("Reverse of the number : "+iRet);


    }
}
