// Input : 4 4
/*
   a a a a
   B B B B
   c c c c
   D D D D
 */


import java.util.*;

class Pattern{
    public void Display(int iRow ,int iCol)
    {
        int i = 0, j = 0;
        int iCnt = 0;
    
        for( i = 1,iCnt = 1 ; i <= iRow ; i++)
        {
            for(j = 1  ; j<= iCol; j++,iCnt++)
            {
                System.out.print(iCnt +"\t");
            }
            System.out.println("\n");
        }

    }
}


public class program102 {

    public static void main(String[] args) {
        int iValue1 = 0;
        int iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Row :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Number of Columns :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2);   
    }
}