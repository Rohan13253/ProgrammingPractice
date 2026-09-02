import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 56. Merge Intervals

// Given an array of intervals where intervals[i] = [starti, endi], 
// merge all overlapping intervals, 
// and return an array of the non-overlapping intervals that cover all 
// the intervals in the input.

// Example 1:

// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length < 1)return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> list = new ArrayList<>();
        
        int[] newInterval = intervals[0];
        list.add(newInterval);
        
        for(int i = 1; i < intervals.length; i++) 
        {
    
        int currentStart = intervals[i][0];
        int currentEnd = intervals[i][1];

        if(currentStart <= newInterval[1]) 
        {
            newInterval[1] = Math.max(newInterval[1], currentEnd);
        }
        else 
        {
            newInterval = intervals[i];
            list.add(newInterval);
        }
    }
        return list.toArray(new int[list.size()][]);
        
    }
}

public class MergeIntervals {
    public static void main(String[] args) {
        
    }
}