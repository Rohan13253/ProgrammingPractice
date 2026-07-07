import java.util.*;

/**
 * Hashmap
 */
public class Hashmap {

    public static void main(String[] args) {
        
        HashMap<Integer,String> hashMap = new HashMap<>();
        
        hashMap.put(1, "Rohan");
        hashMap.put(2, "Harish");
        hashMap.put(3, "Rugwed");

        System.out.println(hashMap);
        // Returns null if key in not present
    }
}
