import java.util.Scanner;


class  Number 
{
    public int SumNonFactor(int iNo)
    {
       int iCnt = 0;
       int iSum = 0;
       for(iCnt = 1 ; iCnt <= iNo;iCnt++)
       {
        if(iNo % iCnt != 0)
        {
            iSum = iSum + iCnt;
        }
       }
       return iSum;
    }
    
}
public class program63 {

    
    public static void main(String[] args) {

        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int iValue = sobj.nextInt();

        Number nobj = new Number();
        iRet = nobj.SumNonFactor(iValue);
         System.out.println("Sumation of Nonfactor "+iRet);

    }
}
