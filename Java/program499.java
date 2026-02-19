import java.util.*;
/*
 *  Convert str1 char array as Arr
 *  Convert str2 char array as Brr
 * 
 *  Create Array Count1 of size 26 for Arr
 *  Create Array Count2 of size 26 for Arr
 * 
 *  tarvel Arr And maintain the frequency in Count1
 *  tarvel Brr And maintain the frequency in Count2
 * 
 *  compare Count1 and Count 2
 *  if they are equal return true
 *  otherwise return false
 */
class Marvellous
{
    public static boolean CheckAnagram(String str1, String str2)
    {

        boolean bflag = true;
        int i = 0;

        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        int Count1[] = new int[26];
        int Count2[] = new int[26];

        for(i = 0; i < Arr.length ;i++)
        {
            if(Arr[i] >= 'a' && Arr[i]<= 'z')
            {
                Count1[Arr[i]-'a']++;
            }
        }

        for(i = 0; i < Arr.length ;i++)
        {
            if(Arr[i] >= 'a' && Arr[i]<= 'z')
            {
                Count2[Brr[i]-'a']++;
            }
        }

        for( i = 0; i< 26 ; i++)
        {
            if(Count1[i] != Count2[i])
            {
                bflag = false;
                break;
            }
        }

        return bflag;
    }
}

public class program499
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The 1st String : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter The 2nd String : ");
        String str2 = sobj.nextLine();

        boolean bRet = false;
        bRet = Marvellous.CheckAnagram(str1, str2);

         if(bRet == true)
         {
            System.out.println("Strings are anagram");
         }
         else
         {
            System.out.println("Non Anagram");
         }

    }    
}