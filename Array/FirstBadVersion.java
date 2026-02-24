
class ArrayX
{
    int FirstBadVersionX(String []arr)
    {

        int left = 0;
        int right = arr.length -1;

        while(left <= right)
        {
            int mid = left + (right - left)/2;

            if(arr[mid] == "BAD")
            {
                right = mid - 1;
            }
            else
            {
                left = mid +1;
            }
        }


        return left;
    }
}

public class FirstBadVersion {
    public static void main(String[] args) {
        
    }
}
