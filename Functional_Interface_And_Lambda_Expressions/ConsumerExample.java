package Functional_Interface_And_Lambda_Expressions;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = (str) -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello"); // HELLO

        Consumer<List<Integer>> listConsumer1 = li -> {
          for(Integer value: li){
              System.out.println(value + 100);
          }
        };

        Consumer<List<Integer>> listConsumer2 = li -> {
            for(Integer value: li){
                System.out.println(value);
            }
        };

    }
}

