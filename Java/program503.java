import java.util.*;

public class program503
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The  String : ");
        String str = sobj.nextLine();

       str = str.replaceAll(" ", "");

       System.out.println(str);
         
    }    
}