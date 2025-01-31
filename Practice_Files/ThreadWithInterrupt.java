public class ThreadWithInterrupt extends Thread{
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("Thread is running...");
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception: " + e);
        }
    }

    public static void main(String[] args) {
        ThreadWithInterrupt t1 = new ThreadWithInterrupt();
        t1.start();
        t1.interrupt();
    }
}
