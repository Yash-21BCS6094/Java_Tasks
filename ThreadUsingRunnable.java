public class ThreadUsingRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " executing run() method");
    }

    public static void main(String[] args) {
        ThreadUsingRunnable ex = new ThreadUsingRunnable();
        Thread t1 = new Thread(ex);
        t1.start();
    }
}
