// Input : 4 4
/*
  0 * * *
  0 0 * *
  0 0 0 *
  0 0 0 0
 */


import java.util.*;

class Pattern{
    public void Display(int iRow ,int iCol)
    {
        int i = 0, j = 0;
        
        if(iRow != iCol)
        {
            System.out.println("Invalid input");
            return;
        }
        for( i = 1; i <= iRow ; i++)
        {
            
            for(j = 1  ; j <= iCol; j++)
            {
            if(i >= j)
            {
                System.out.print("*\t");
            }
            
            }
            System.out.println("\n");
        }

    }
}


public class program110 {

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