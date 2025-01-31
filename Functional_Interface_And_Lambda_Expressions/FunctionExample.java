package Functional_Interface_And_Lambda_Expressions;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> intToString = (num) -> "Number: " + num;
        System.out.println(intToString.apply(5)); // Number: 5
    }
}