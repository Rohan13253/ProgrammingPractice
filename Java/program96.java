// Input : 4 4
/*
   A B C D
   E F G H
   I J K


 */


import java.util.*;

class Pattern{
    public void Display(int iRow ,int iCol)
    {
        int i = 0, j = 0;
        char ch = 'A';

        for( i = 1 ; i <= iRow ; i++)
        {
            for(j = 1 ; j<= iCol; j++)
            {
                System.out.print(ch+"\t");
                ch++; 
            }
            System.out.println("\n");
        }

    }
}


public class program96 {

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