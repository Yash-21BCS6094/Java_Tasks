package Set_Implementation;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set_Demo {
    public static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(4);
        tset.add(2);
        tset.add(1);
        tset.add(3);
        tset.add(5);
        System.out.println("Treeset content is: " + tset);
        Iterator<Integer> it = tset.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        tset.remove(3);
        System.out.println();
        System.out.println("First element: = " + tset.first());
        System.out.println("Last element: = " + tset.last());

    }
}
