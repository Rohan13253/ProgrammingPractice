import java.util.*;
class Solution {
    public int rob(int[] nums) {
        
        int prev1 = 0;
        int prev2 = 0;
        
        
        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            
            int currentCrystal = nums[i];

            int takeCurrent = currentCrystal + prev2;
            int skipCurrent = prev1;

            int currentMax = Math.max(takeCurrent, skipCurrent);
            
            prev2 = prev1;
            prev1 = currentMax;
        }
       
        return prev1;
    } 

}