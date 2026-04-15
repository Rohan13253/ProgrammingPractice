import java.util.*;

class Matrix
{
    public int Arr[][];

    public Matrix(int A , int B)
    {
        Arr = new int[A][B];
    }
}

public class program535 
{
    public static void main(String[] args) 
    {
        Matrix mobj = new Matrix(4,3 );
        System.out.println(mobj.Arr.length);      //4
        System.out.println(mobj.Arr[0].length);   //3
        
    }
}
