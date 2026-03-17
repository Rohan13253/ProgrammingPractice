import java.util.*;
import java.util.stream.Stream;;

public class demo2 {
    
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(2,9,5,8,7,6);

        Stream<Integer> data = nums.stream();

        // // Once u use stream u cant reuse it.()
        // data.forEach(n -> System.out.println(n));

        long count = data.count();
        System.out.println(count);

        data.forEach(n -> System.out.println(n));// Once u use stream u cant reuse it.
    
    }
}
