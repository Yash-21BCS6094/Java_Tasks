package Optional_And_Stream_Operations;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Yash", 500),
                new Student("Sumit", 400),
                new Student("Utkarsh", 300),
                new Student("Milan", 200),
                new Student("Pankaj", 100)
        );
        // Using simple stream
        System.out.println("Printing data according to sequential stream");
        studentList.stream().filter(s -> s.getScore() >= 80).limit(3).forEach(
                stud -> System.out.println(stud.getName()+ " " +stud.getScore())
        );

        // Using parallel stream
        System.out.println("Printing data according to parallel stream");
        studentList.parallelStream().filter(s -> s.getScore() >= 80).
                limit(3).
                forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore()));


    }
}
