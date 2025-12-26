import java.util.*;
class Digits
{
    public int CountFrequency(int iNo)
    {
        int iDigits =0;
        int iCnt = 0;
        while(iNo != 0)
        {
            iDigits = iNo %10;
            iNo =iNo/10;
            if(iDigits == 5)
            {
                iCnt++;
            }

        }
        return iCnt;
    }
}
public class program68 {
    public static void main(String[] args) {
        
        int iValue = 0;
        int iRet = 0;
        System.out.println("Enter number");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        

        iRet = dobj.CountFrequency(iValue);

        System.out.println(iRet);


    }
}
