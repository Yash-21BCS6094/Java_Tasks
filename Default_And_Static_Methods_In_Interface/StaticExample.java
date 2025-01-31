package Default_And_Static_Methods_In_Interface;

interface StaticInterface{
    static void sayHello(){
        System.out.println("Hello! ");
    }
}

public class StaticExample implements StaticInterface {

    // Static methods are hidden in classes which are implementing them so this sayHello is
    // completely different from StaticInterface sayHello
    static void sayHello(){
        System.out.println("Hello! ");
    }
    public static void main(String[] args) {
        // To access static methods of StaticInterface we can use interface name with a dot as
        // stated below
        StaticInterface.sayHello();
        // Static method of static interface cannot be overridden or changed in classes which are
        // implementing them.



    }
}
