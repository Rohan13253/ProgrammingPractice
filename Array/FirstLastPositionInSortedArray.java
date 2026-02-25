// 34. Find First and Last Position of Element in Sorted Array
// Medium

// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

class ArrayX
{
    int [] FirstLastPositionInSortedArrayX(int []arr,int iData)
    {

        int left = 0;
        int right = arr.length -1;

        int max = -1;
        int min = -1;

        while(left <= right)
        {
            int mid = left + (right - left)/2;

            if (arr[mid] == iData) {
                min = mid;       
                right = mid - 1; 
            } 
            else if (arr[mid] > iData) {
                right = mid - 1; 
            } 
            else {
                left = mid + 1;
            } 
        }

        left = 0;
        right = arr.length -1;


        while(left <= right)
        {
            int mid = left + (right - left)/2;

            if (arr[mid] == iData) {
                max = mid;       
                left = mid + 1;
            } 
            else if (arr[mid] > iData) {
                right = mid - 1; 
            } 
            else {
                left = mid + 1;
            } 
            
        }

        return new int[]{min, max};
    }
}

public class FirstLastPositionInSortedArray {
    
}
