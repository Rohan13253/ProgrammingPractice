import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1); 
            } else {
                map.put(num, 1); 
            }
        }

        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }

        int[] result = new int[k];
        int counter = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[counter] = num;
                    counter++;
                    if (counter == k) {
                        return result;
                    }
                }
            }
        }
        
        return result;
    }
}

public class TopkFrequentElement {
    
}
