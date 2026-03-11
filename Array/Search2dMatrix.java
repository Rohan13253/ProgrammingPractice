
class ArrayX
{
    boolean Search2dMatrix(int[][] arr, int target) {
    int rows = arr.length;
    int cols = arr[0].length; 

    int left = 0;
    int right = (rows * cols) - 1; 

    while (left <= right) {
        int mid = left + (right - left) / 2;

        
        int row = mid / cols;
        int col = mid % cols;
        int midValue = arr[row][col]; 

        if(midValue == target)
        {
            return true;
        }
        else if( target < midValue)
        {
            right  = mid -1;
        }
        else
        {
            left = mid  +1;
        }
        
    }
    return false;
    }
}

public class Search2dMatrix {
    
}
