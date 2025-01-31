package Optional_And_Stream_Operations;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        // Sample list of numbers
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        // 1. Filtering (Keep only even numbers)
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Even Numbers: " + evenNumbers);

        // 2. Mapping (Square each number)
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .toList();
        System.out.println("Squared Numbers: " + squaredNumbers);

        // 3. Sorting (Ascending Order)
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();
        System.out.println("Sorted Numbers: " + sortedNumbers);

        // 4. Distinct Elements (Removing duplicates)
        List<Integer> distinctNumbers = Arrays.asList(10, 20, 30, 10, 20, 40, 50, 60)
                .stream()
                .distinct()
                .toList();
        System.out.println("Distinct Numbers: " + distinctNumbers);

        // 5. Limit (First 5 numbers)
        List<Integer> limitedNumbers = numbers.stream()
                .limit(5)
                .toList();
        System.out.println("Limited Numbers (First 5): " + limitedNumbers);

        // 6. Skip (Skip first 3 numbers)
        List<Integer> skippedNumbers = numbers.stream()
                .skip(3)
                .toList();
        System.out.println("Skipped Numbers (After first 3): " + skippedNumbers);

        // 7. Reduce (Sum of all numbers)
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of Numbers: " + sum);

        // 8. Count (Total elements)
        long count = numbers.stream().count();
        System.out.println("Count of Numbers: " + count);

        // 9. Find First Element
        Optional<Integer> firstElement = numbers.stream().findFirst();
        firstElement.ifPresent(n -> System.out.println("First Element: " + n));

        // 10. Find Any Element
        Optional<Integer> anyElement = numbers.stream().findAny();
        anyElement.ifPresent(n -> System.out.println("Any Element: " + n));

        // 11. All Match (Check if all numbers are > 5)
        boolean allGreaterThanFive = numbers.stream().allMatch(n -> n > 5);
        System.out.println("Are all numbers > 5? " + allGreaterThanFive);

        // 12. Any Match (Check if any number is > 90)
        boolean anyGreaterThanNinety = numbers.stream().anyMatch(n -> n > 90);
        System.out.println("Is any number > 90? " + anyGreaterThanNinety);

        // 13. None Match (Check if no number is < 0)
        boolean noneLessThanZero = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("Are no numbers < 0? " + noneLessThanZero);

        // 14. Grouping By (Group numbers by even and odd)
        Map<Boolean, List<Integer>> groupedByEvenOdd = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println("Grouped By Even/Odd: " + groupedByEvenOdd);

        // 15. Partitioning By (Partition numbers into two groups: <50 and >=50)
        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n < 50));
        System.out.println("Partitioned Numbers (<50 and >=50): " + partitionedNumbers);

        // 16. Joining (Concatenating numbers as a string)
        String joinedNumbers = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println("Joined Numbers: " + joinedNumbers);

        // 17. Generate an infinite stream (Limit to 5 random numbers)
        Stream<Integer> randomNumbers = Stream.generate(() -> new Random().nextInt(100)).limit(5);
        System.out.println("Random Numbers: " + randomNumbers.toList());

        // 18. IntStream (Range of numbers)
        IntStream.range(1, 6).forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 19. Parallel Stream (Parallel processing of the list)
        List<Integer> parallelProcessed = numbers.parallelStream()
                .map(n -> n * 2)
                .toList();
        System.out.println("Parallel Processed Numbers: " + parallelProcessed);

        // 20. Collecting to Set (Convert list to a Set)
        Set<Integer> numberSet = numbers.stream().collect(Collectors.toSet());
        System.out.println("Number Set: " + numberSet);
    }
}
