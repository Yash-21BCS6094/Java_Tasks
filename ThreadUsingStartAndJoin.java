public class ThreadUsingStartAndJoin extends Thread{
    @Override
    public void run(){
        for(int i = 0; i <= 1000; i++) {
            System.out.println("World");
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ThreadUsingStartAndJoin t1 = new ThreadUsingStartAndJoin();
        t1.start();
        t1.join();
        System.out.println("Hi I am in main!");
    }
}
