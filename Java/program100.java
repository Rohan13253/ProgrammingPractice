// Input : 4 4
/*
   a a a a
   b b b b
   c c c c
   d d d d
 */


import java.util.*;

class Pattern{
    public void Display(int iRow ,int iCol)
    {
        int i = 0, j = 0;
        char ch = '\0';

        for( i = 1 ,ch = 'a'; i <= iRow ; i++,ch++)
        {
            for(j = 1  ; j<= iCol; j++)
            {
                System.out.print(ch+"\t");
                
            }
            System.out.println("\n");
        }

    }
}


public class program100 {

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