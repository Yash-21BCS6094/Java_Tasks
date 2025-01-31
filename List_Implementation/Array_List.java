package List_Implementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);

        arrayList.remove(2);

        for(int val: arrayList){
            System.out.println("Data = " + val);
        }
    }
}
