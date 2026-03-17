import java.util.*;
import java.util.stream.Stream;;

public class demo1 {
    
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4,5,6,7);

        Stream<Integer> data = nums.stream();

        // data.forEach(n -> System.out.println(n));

        // // changing value of stream will not affect the list

        // // Once u use stream u cant reuse it.()
        // data.forEach(n -> System.out.println(n));

        // long count = data.count();
        // System.out.println(count);

        // data.forEach(n -> System.out.println(n));// Once u use stream u cant reuse it.

        Stream<Integer> sortedData = data.sorted();

        sortedData.forEach(n -> System.out.println(n));
    
    }
}
