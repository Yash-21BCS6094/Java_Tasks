package Producer_Consumer_Blocking_Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> que = new ArrayBlockingQueue<>(4);
        Producer producer = new Producer(que); // Producer
        Consumer consumer = new Consumer(que); // Consumer

        // Making thread1 and thread2 as threads
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        // start both the thread
        thread1.start();
        thread2.start();


    }
}
