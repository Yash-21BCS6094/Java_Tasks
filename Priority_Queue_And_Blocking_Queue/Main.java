package Priority_Queue_And_Blocking_Queue;

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
  /*   public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        // addition of integer elements in pq
        pq.add(1);
        pq.add(2);
        pq.add(3);

        // using peek()
        System.out.println(pq.peek());

        // looping the pq
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }

    }
    */

    public static void main(String[] args){

        PriorityBlockingQueue<Integer> pbq
                = new PriorityBlockingQueue<Integer>();

        // adding  numbers
        pbq.add(12);
        pbq.add(2);
        pbq.add(31);
        pbq.add(4);
        pbq.add(52);

        // Simply printing the pq will not give elements in ascending order
        System.out.println("PriorityBlockingQueue:" + pbq);
    }
}
