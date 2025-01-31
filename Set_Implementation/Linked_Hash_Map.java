package Set_Implementation;
import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_Hash_Map {
    public static void main(String args[]) {
        LinkedHashMap<Integer, String> lhm
                = new LinkedHashMap<Integer, String>();

        lhm.put(3, "Yash");
        lhm.put(2, "Sumit");
        lhm.put(1, "Hello");

        // For-each loop for traversal over Map
        for (Map.Entry<Integer, String> mapElement :
                lhm.entrySet()) {
            Integer k = mapElement.getKey();
            String v = mapElement.getValue();
            System.out.println(k + " : " + v);
        }
    }
}
