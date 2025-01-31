package List_Implementation;

import java.util.List;
import java.util.Stack;

public class Stack_Implementation {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            stack.add(i);
        }
        System.out.println(stack);
        stack.remove(3);
        System.out.println(stack);
        for(int i = 0; i < stack.size(); i++){
            System.out.println(stack.get(i) + " ");
        }

    }
}
