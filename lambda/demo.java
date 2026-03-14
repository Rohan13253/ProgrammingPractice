
@FunctionalInterface
interface A {

    void show();
}

// class B implements A
// {
//     public void show()
//     {
//         System.out.println("Hi");
//     }
// }
              

public class demo {
    public static void main(String[] args) {
        
        A obj = new A(){ 
            public void show()
            {
                System.out.println("Hi in show ");
            } 
        };
        obj.show();
    }
}
