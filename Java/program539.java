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
    public int Sum()
    {
        System.out.println("Please enter the elemets of matraix: ");

        Scanner sobj = new Scanner(System.in);

        int i =0 , j =0 ,iSum =0;

        for(i = 0; i <Arr.length;i++)
        {
            for( j= 0 ; j < Arr[i].length;j++)
            {
                
                    iSum = iSum +Arr[i][j];
                 
            }
        }
        return iSum;
    }
    public int Max()
    {
        System.out.println("Please enter the elemets of matraix: ");

        Scanner sobj = new Scanner(System.in);

        int i =0 , j =0 ,iMax =0;

        iMax = Arr[0][0];

        for(i = 0; i <Arr.length;i++)
        {
            for( j= 0 ; j < Arr[i].length;j++)
            {
                
                if(Arr[i][j] > iMax)
                {
                    iMax = Arr[i][j];
                }
                 
            }
        }
        return iMax;
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

public class program539 
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
        System.out.println("Even count is : "+iRet);

        int sRet = mobj.Sum();
        System.out.println("Sum is : "+sRet);

        int mRet = mobj.Max();
        System.out.println("Sum is : "+mRet);

    }
}
