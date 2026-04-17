import java.util.*;

class Matrix
{
    private int Arr[][];

    public Matrix(int A , int B)
    {
        Arr = new int[A][B];
    }

    public void Accept()
    {
        System.out.println("Please enter the elemets of matraix: ");

        Scanner sobj = new Scanner(System.in);

        int i =0 , j =0;

        for(i = 0; i <Arr.length;i++)
        {
            for( j= 0 ; j < Arr[i].length;j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }
    public int CountEven()
    {
        System.out.println("Please enter the elemets of matraix: ");

        Scanner sobj = new Scanner(System.in);

        int i =0 , j =0 ,iCount =0;

        for(i = 0; i <Arr.length;i++)
        {
            for( j= 0 ; j < Arr[i].length;j++)
            {
                if(Arr[i][j] %2 == 0)
                {
                    iCount++;
                }
                 
            }
        }
        return iCount;
    }

    public void Display()
    {
        System.out.println("Elemets of matraix are : ");

        int i =0 , j =0;

        for(i = 0; i <Arr.length;i++)
        {
            for( j= 0 ; j < Arr[i].length;j++)
            {
                System.out.print(Arr[i][j]+"\t");
                
            }
        }
    }
}

public class program537 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int iRow = sobj.nextInt();

        System.out.println("Enter number of colums: ");
        int iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow,iCol);
       
        mobj.Accept();
        mobj.Display();
        int iRet = mobj.CountEven();

    }
}
