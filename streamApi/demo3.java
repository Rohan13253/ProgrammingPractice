import java.util.*;
import java.util.stream.Stream;;

public class demo3 {
    
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(2,9,5,8,7,6);

        Stream<Integer> data = nums.stream();
        Stream<Integer> sortedData = data.sorted();

        sortedData.forEach(n -> System.out.println(n));
    
    }
}
