package Functional_Interface_And_Lambda_Expressions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Normal supplier that returns a random number whenever called
        Supplier<Double> getRandomNumber = () -> Math.random();
        System.out.println(getRandomNumber.get());

        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(100));
        }

    }
}
