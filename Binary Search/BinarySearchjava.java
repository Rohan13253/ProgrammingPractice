class Search {
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        // <= is critical! It allows checking an array of size 1.
        while (left <= right) {
            // The Overflow-Safe Midpoint
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found! Return the index.
            } 
            else if (arr[mid] < target) {
                // Target is larger. Discard the left half entirely.
                left = mid + 1; 
            } 
            else {
                // Target is smaller. Discard the right half entirely.
                right = mid - 1; 
            }
        }
    
        return -1; // Loop finished and we never found it
    }
}
public class BinarySearchjava {
    public static void main(String[] args) {
        
    }
}
