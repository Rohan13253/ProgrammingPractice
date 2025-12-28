import java.util.*;
class Digits
{
    public int CountEven(int iNo)
    {
        int iDigits =0;
        int iCnt = 0;
        while(iNo != 0)
        {
            iDigits = iNo %10;
            
            if(iDigits % 2 == 0)
            {
                iCnt++;
            }
            iNo = iNo / 10;

        }
        return iCnt;

    }
}
public class program72 {
    public static void main(String[] args) {
        
        int iValue = 0;
        int iRet = 0;
       
        System.out.println("Enter number");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        

        iRet = dobj.CountEven(iValue);
        System.out.println("Number of even digits are : "+iRet);


    }
}
