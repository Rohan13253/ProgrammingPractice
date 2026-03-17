import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;;

public class demo5 {
    
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(2,9,5,8,7,6);

        Stream<Integer> data = nums.stream();

        // Filters take and object of predicate 
        // Predicate : functional interface which has method test
        // Method test Returs true or false 

       

        // Predicate<Integer> predi = n-> n%2 == 1;

        

        nums.stream() // 1st stream
            .filter( n -> n%2 == 1) // 2nd
            .sorted() // 3nd
            .map(n -> n*2) // 4rd
            .forEach(n -> System.out.println(n));
    }
}
