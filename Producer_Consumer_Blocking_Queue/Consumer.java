package Producer_Consumer_Blocking_Queue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    int consumed = -1;
    BlockingQueue<Integer> que;
    Consumer(BlockingQueue<Integer> obj){
        this.que = obj;
    }
    @Override
    public void run(){
        while(!que.isEmpty()){
            int element = 0;
            try {
                element = que.take();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Consumed by Consumer: " + element);
        }
    }
}
