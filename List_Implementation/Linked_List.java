package List_Implementation;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> l1 =  new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        System.out.println(l1);

        l1.remove(3);
        System.out.println(l1);
        
        for(int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i) + " ");
        }

    }
}

