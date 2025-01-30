public class ThreadNameAndPriority extends Thread{

    public ThreadNameAndPriority(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ThreadNameAndPriority low = new ThreadNameAndPriority("Low Priority Thread");
        ThreadNameAndPriority medium = new ThreadNameAndPriority("Medium Priority Thread");
        ThreadNameAndPriority high = new ThreadNameAndPriority("High Priority Thread");
        low.start();
        medium.start();
        high.start();
        low.setPriority(Thread.MIN_PRIORITY);
        low.setPriority(Thread.NORM_PRIORITY);
        low.setPriority(Thread.MAX_PRIORITY);

    }
}
