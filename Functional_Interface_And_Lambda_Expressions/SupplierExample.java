package Functional_Interface_And_Lambda_Expressions;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> getRandomNumber = () -> Math.random();
        System.out.println(getRandomNumber.get());
    }
}
