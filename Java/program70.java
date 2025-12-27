import java.util.*;
class Digits
{
    public void DisplayEven(int iNo)
    {
        int iDigits =0;
        int iCnt = 0;
        while(iNo != 0)
        {
            iDigits = iNo %10;
            
            if(iDigits % 2 == 0)
            {
                System.out.println(iDigits);
            }
            iNo = iNo / 10;

        }

    }
}
public class program70 {
    public static void main(String[] args) {
        
        int iValue = 0;
       
        System.out.println("Enter number");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        

        dobj.DisplayEven(iValue);


    }
}
