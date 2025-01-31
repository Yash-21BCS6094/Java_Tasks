package Functional_Interface_And_Lambda_Expressions;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // For even and odd
        Predicate<Integer> isEven = (num) -> num % 2 == 0;
        System.out.println("Is the provided number even or not ? " + isEven.test(4)); // true
        System.out.println("Is the provided number even or not ? " + isEven.test(7)); // false

        // For greater than one or not
        Predicate<Integer> salaryGreaterThanOne = (x) -> x > 1;
        System.out.println("Is the provided number greater than one ? " + salaryGreaterThanOne.test(1));
        System.out.println("Is the provided number greater than one ? " + salaryGreaterThanOne.test(2));

        // Just for fun and exploration
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();

        // For complex operations using predicate
        Predicate<String> startsWithV = x -> x.toLowerCase().charAt(0) == 'v';
        Predicate<String> endsWithL = x -> x.toLowerCase().charAt(0) == 'l';
        Predicate<String> and = startsWithV.and(endsWithL);
        System.out.println("Does Vipul starts with V and ends with L ? " + and.test("Vipul"));
        System.out.println("Does Vivek starts with V and ends with L ? " + and.test("Vipul"));

        // For predicate with classes and object
        Student student1 = new Student("Vipul", 1);
        Student student2 = new Student("Ram", 2);
        Predicate<Student> studentPredicate = x -> x.getId() > 1;
        System.out.println("Is student id greater than one ? "+ studentPredicate.test(student1));
        System.out.println("Is student id greater than one ? " + studentPredicate.test(student2));

    }
}
