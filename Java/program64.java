import java.util.Scanner;


class  Number 
{
    public void Sum(int iNo)
    {
       int iCnt = 0;
       int iSum1 = 0;
       int iSum2 = 0;
       int iAdd = 0;
       for(iCnt = 1 ; iCnt <= iNo;iCnt++)
       {
        if(iNo % iCnt != 0)
        {
            iSum1 = iSum1 + iCnt;
        }
        else
        {
            iSum2 = iSum2 + iCnt;
        }
       }
       iAdd = iSum1 + iSum2;
       System.out.println("Sumation of factor is : "+iSum1);
       System.out.println("Sumation of Non factor is : "+iSum2);
       System.out.println("Sumation of Factor and Non factor is : "+iAdd);
       
    }
    
}
public class program64 {

    
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int iValue = sobj.nextInt();

        Number nobj = new Number();
        nobj.Sum(iValue);
        

    }
}
