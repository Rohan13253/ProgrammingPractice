import java.util.*;
class Digits
{
    public void DisplayEven(int iNo)
    {
        int iCnt = 0;
        while(iNo != 0)
        {
            
            if(((iNo %10) % 2 )== 0)
            {
                System.out.println(iNo %10);
            }
            iNo = iNo / 10;

        }

    }
}
public class program71 {
    public static void main(String[] args) {
        
        int iValue = 0;
       
        System.out.println("Enter number");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        

        dobj.DisplayEven(iValue);


    }
}
