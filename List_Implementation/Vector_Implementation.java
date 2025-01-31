package List_Implementation;

import java.util.List;
import java.util.Vector;

public class Vector_Implementation {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> vec = new Vector<>();

        for(int i = 0; i < n; i++){
            vec.add(i);
        }
        vec.remove(3);
        for(int val: vec) {
            System.out.print(val + " ");
        }
    }
}
