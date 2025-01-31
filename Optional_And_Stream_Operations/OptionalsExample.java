package Optional_And_Stream_Operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Find the first element
        Optional<Integer> firstElement = numbers.stream().findFirst();
        firstElement.ifPresent(n -> System.out.println("First Element: " + n));

        // Find any element (useful in parallel streams)
        Optional<Integer> anyElement = numbers.stream().findAny();
        anyElement.ifPresent(n -> System.out.println("Any Element: " + n));

        // Reduce to find the sum of numbers
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println("Sum of Numbers: " + sum.orElse(0));

        // Handling empty list safely
        List<Integer> emptyList = Arrays.asList();
        Optional<Integer> emptyResult = emptyList.stream().findFirst();
        System.out.println("First Element of Empty List: " + emptyResult.orElse(-1));
    }
}
