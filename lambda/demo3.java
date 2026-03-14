
@FunctionalInterface
interface Display {

    void  show();
}

public class demo3 {

    public static void main(String[] args) {
        

        Display obj = () -> {
            System.out.println("Addition");
        };

        obj.show();
    }
    
}
