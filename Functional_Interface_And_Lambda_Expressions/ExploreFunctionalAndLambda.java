package Functional_Interface_And_Lambda_Expressions;

interface MathOperation{
    int operate(int a, int b);
}

@FunctionalInterface
interface Greeting {
    void implementHello(String name);
}


public class ExploreFunctionalAndLambda {
    public static void main(String[] args) {
        // Without using Lambda Expression


    /*    MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return 0;
            }
        };
      */
        // Reduces boilerplate code
        // Improves readability
        // Makes code more functional

        MathOperation addition = (a, b) -> a + b; // Lambda expression
        System.out.println("Addition: " + addition.operate(5, 3));

        Greeting greet = (name) -> System.out.println("Hello, " + name);
        greet.implementHello("Yash");
    }
}
