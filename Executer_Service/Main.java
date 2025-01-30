package Executer_Service;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
     public static void main(String [] args){
        CountDownLatch latch1 = new CountDownLatch(5);
        CountDownLatch latch2 = new CountDownLatch(5);
        CountDownLatch latch3 = new CountDownLatch(5);
        CountDownLatch latch4 = new CountDownLatch(5);
        CountDownLatch latch5 = new CountDownLatch(5);

        ExecutorService service = Executors.newFixedThreadPool(2);

        MyThirdThread thread1 = new MyThirdThread("A", latch1);
        MyThirdThread thread2 = new MyThirdThread("B", latch2);
        MyThirdThread thread3 = new MyThirdThread("C", latch3);
        MyThirdThread thread4 = new MyThirdThread("D", latch4);
        MyThirdThread thread5 = new MyThirdThread("E", latch5);

        service.execute(thread1);
        service.execute(thread2);
        service.execute(thread3);
        service.execute(thread4);
        service.execute(thread5);

        service.shutdown();
    }
}
