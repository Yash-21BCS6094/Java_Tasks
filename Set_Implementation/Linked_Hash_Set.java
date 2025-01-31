package Set_Implementation;
import java.util.*;
public class Linked_Hash_Set {
    public static void main(String[] args) {
        Set<String> lh = new LinkedHashSet<String>();
        lh.add("Yash");
        lh.add("Sumit");
        lh.add("Big_Oh");
        lh.add("Notation");
        Iterator it = lh.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        for(String data: lh){
            System.out.println(data + " ");
        }
    }
}
