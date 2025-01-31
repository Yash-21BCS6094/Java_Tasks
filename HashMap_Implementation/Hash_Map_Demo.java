package HashMap_Implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_Map_Demo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(31, "Shubham");
        map.put(11, "Akshita");
        map.put(2, "Neha");

        String student = map.get(31);
        System.out.println(student);
        String s = map.get(69);
        System.out.println(s);

        Set<Integer> keys = map.keySet();
        for(int i: keys){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for(Map.Entry<Integer, String> data: entries) {
            System.out.println(data.getKey() + " " + data.getValue());
        }

    }
}
