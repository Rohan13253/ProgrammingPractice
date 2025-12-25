import java.util.*;

class Digits
{
    public int CountDigits(int iNo)
    { 
        int iCnt = 0;
        int iDigits = 0;
         while(iNo != 0)
         {
            
            iDigits = iNo %10;
            iCnt ++;
            iNo = iNo/ 10 ;
         }
         return iCnt;
    
    }
}
public class program65 {
        public static void main(String[] args) {
        int iRet = 0;    
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        Digits dobj = new Digits();
        System.out.println("Enter the number :");
        iRet = dobj.CountDigits(iValue);

        System.out.println(iRet);

    }
}
