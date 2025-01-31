package Producer_Consumer_Blocking_Queue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    BlockingQueue<Integer> que;
    public Producer(BlockingQueue<Integer> obj){
        this.que = obj;
    }
    @Override
    public void run(){
        for(int i = 0; i < 4; i++){
            try{
                que.put(i);
                System.out.println("Produced in queue " + i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
