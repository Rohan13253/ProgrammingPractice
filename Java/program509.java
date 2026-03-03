
// ___India____ is__ my_country____
//After trim:
//India____is__my_country

import java.util.*;
public class program509 
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

        for(i = 0; i < Arr.length ; i++)
        {
            if(Arr[i] != ' ')
            {
                Brr[j] = Arr[i];
                j++;
            }
        }

        String Output = new String(Brr);

        Output = Output.trim();
        
        System.out.println("Updated string is : "+Output);
        System.out.println("Length is: "+Output.length());


    }
}
