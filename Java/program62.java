import java.util.Scanner;


class  Number 
{
    public void DisplayNonFactor(int iNo)
    {
       int iCnt = 0;
       for(iCnt = 1 ; iCnt <= iNo;iCnt++)
       {
        if(iNo % iCnt != 0)
        {
            System.out.println(iCnt+" is a not a factor");
        }
       }
    }
    
}
public class program62 {

    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int iValue = sobj.nextInt();

        Number nobj = new Number();
        nobj.DisplayNonFactor(iValue);

    }
}
