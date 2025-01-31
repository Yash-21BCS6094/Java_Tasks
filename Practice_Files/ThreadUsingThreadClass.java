public class ThreadUsingThreadClass extends Thread{
    @Override
    public void run(){
        for(int i = 0; i <= 1000; i++) {
            System.out.println("World");
        }
    }

    public static void main(String[] args) {
        ThreadUsingThreadClass t1 = new ThreadUsingThreadClass();
        t1.start();

        for(;;){
            System.out.println("Hello");
        }

    }
}
