package Semaphore;

public class Main {
    // This is for semaphore
   public static void main(String[] args) throws InterruptedException {
        Semaphore sem = new Semaphore(1);
        MySecondThread threadA = new MySecondThread(sem, "A");
        MySecondThread threadB = new MySecondThread(sem,"B");

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println("Shared Instance: " + SharedInstance.data);
    }
}
