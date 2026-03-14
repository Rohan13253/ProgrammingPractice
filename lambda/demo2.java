import java.util.ArrayList;

public class demo2 {
    
    public static void main(String[] args) {

       ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3); 

        System.out.println("All element");
        list.forEach(x -> System.out.println(x));

        System.out.println("All Even");

        list.forEach(x -> {
            if(x % 2 == 0)
            {
                System.out.println(x);
            }
        });

    }
    

    
}
