import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayX 
{
    List<List<Integer>> ThreeSumX(int []arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> masterList = new ArrayList<>();
    
        for(int i = 0 ; i < arr.length -1;i++)
        {
            int left = i +1;
            int right = arr.length -1;

            if (i > 0 && nums[i] == nums[i-1]) continue;

            while(left < right)
            {
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == 0)
                {
                    masterList.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                }
                else if(sum > 0)
                {
        
                    right--;
                }
                else
                {
                    left++;
                }

                }
        }
        return masterList;
    }

}


public class ThreeSum {
    
}
