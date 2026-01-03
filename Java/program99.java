// Input : 4 4
/*
   A A A A
   B B B B
   C C C C
   D D D D
 */


import java.util.*;

class Pattern{
    public void Display(int iRow ,int iCol)
    {
        int i = 0, j = 0;
        char ch = '\0';

        for( i = 1 ,ch = 'A'; i <= iRow ; i++,ch++)
        {
            for(j = 1  ; j<= iCol; j++)
            {
                System.out.print(ch+"\t");
                
            }
            System.out.println("\n");
        }

    }
}


public class program99 {

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