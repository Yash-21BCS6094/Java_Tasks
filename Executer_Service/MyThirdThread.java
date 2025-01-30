import java.util.concurrent.CountDownLatch;

public class MyThirdThread extends  Thread{
    String threadName = "";
    CountDownLatch latch;
    MyThirdThread(String threadName, CountDownLatch latch){
        this.threadName = threadName;
        this.latch = latch;
    }

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(threadName + ":" + i);
            latch.countDown();
        }
    }
}
