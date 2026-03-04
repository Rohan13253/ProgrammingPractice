
// ___India____ is__ my_country____
//After trim:
//India____is__my_country

import java.util.*;
public class program511 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string: ");

        String str = sobj.nextLine();

        str = str.trim();

        char Arr[] = str.toCharArray();
        char Brr[] = new char[Arr.length];

        int iCount = 0, i = 0 , j = 0;
        boolean bflag = false;

        for(i = 0; i < Arr.length ; i++)
        {
            if(Arr[i] != ' ')
            {
                Brr[j] = Arr[i];
                j++;
                bflag = false;
            }
            else if(Arr[i]== ' ')
            {
                if(bflag == false)
                {
                    Brr[j] = ' ';
                    j++;
                    bflag = true;
                }
                
            }
        }

        String Output = new String(Brr);

        Output = Output.trim();

        char Crr[] = Output.toCharArray();

        for(i = 0; i < Crr.length;i++)
        {
            if(Crr[i] == ' ')
            {
                iCount++;
            }
        }
        
        System.out.println("Number of words are : "+(iCount+1));

    }
}
