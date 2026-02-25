
class ArrayX
{
    int MinimumInRoatetedArrayX(int []arr)
    {

        int left = 0;
        int right = arr.length -1;

        while(left < right)
        {
            int mid = left + (right - left)/2;

            if(arr[mid] > arr[right])
            {
                right = mid;
            }
            else
            {
                left = mid;
            }
        }


        return left;
    }
}

public class MinimumInRoatetedArray {
    
}
