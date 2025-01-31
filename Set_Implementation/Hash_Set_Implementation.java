package Set_Implementation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Hash_Set_Implementation {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        // adding elements in set
        hashSet.add("Yash");
        hashSet.add("Sumit");
        hashSet.add("Geeks");
        hashSet.add("For");
        hashSet.add("Geeks");

        System.out.println(hashSet);
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(1, 3, 5, 7, 4, 0, 7, 5));

        // For getting union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);

        System.out.println("Union of two set");
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(b);
        intersection.retainAll(a);

        // For getting intersection
        System.out.println("Intersection of two set: ");
        System.out.println(intersection);

    }
}
