package Default_And_Static_Methods_In_Interface;

interface Parent{
    default void sayHello(){
        System.out.println("Hello");
    }
}

class Child implements Parent{
    @Override
    public void sayHello(){
        System.out.println("Child says hello");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Parent par = new Child();
        par.sayHello();
    }
}
