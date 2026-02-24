
class ArrayX
{
    int SearchInsertX(int[]arr, int iData)
    {
        int right = arr.length - 1;
        int left = 0;

        while(left <= right)
        {
            int mid = left + (right - left)/2;

            if(arr[mid] == iData)
            {
                return mid;
            }
            else if(iData < arr[mid])
            {
                right = mid -1;
            }
            else
            {
                left = mid +1;
            }
        }
        return left;
    }
}

public class SearchInsert {
    public static void main(String[] args) {
        
    }
}
