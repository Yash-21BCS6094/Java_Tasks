package Binary_Semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Semaphore sem = new Semaphore(1);
//        Semaphore sem = new Semaphore(5);

        MyThread threadA = new MyThread(sem, "A");
        MyThread threadB = new MyThread(sem,"B");
        System.out.println("Shared Instance intial value : " + SharedInstance.data);

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println("Shared Instance final value: " + SharedInstance.data);
    }
}
