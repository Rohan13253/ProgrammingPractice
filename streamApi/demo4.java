import java.util.*;
import java.util.stream.Stream;;

public class demo4 {
    
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(2,9,5,8,7,6);

        Stream<Integer> data = nums.stream();

        // for(int x: nums)
        // {
        //     System.out.println(x*2);
        // }
    
        // Stream<Integer> mappedData = data.map(n -> n*2);
        
        // mappedData.forEach(n -> System.out.println(n));

        nums.stream() // 1st stream
            .filter(n -> n%2 ==1) // 2nd
            .sorted() // 3nd
            .map(n -> n*2) // 4rd
            .forEach(n -> System.out.println(n));
    }
}
