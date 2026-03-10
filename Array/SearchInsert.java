
// 35. Search Insert Position
// Easy

// Given a sorted array of distinct integers and a target value,
// return the index if the target is found. 
// If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [1,3,5,6], target = 5
// Output: 2.

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
