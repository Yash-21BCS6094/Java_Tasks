package Priority_Queue_And_Blocking_Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class BlockingQueueExample{
    public static void main(String [] args){
        BlockingQueue<Integer> que = new LinkedBlockingQueue<>(3);
        try{
            que.add(1);
            que.add(2);
            que.add(3);
            que.add(4);
//            System.out.println(que);
        }catch(RuntimeException e){
            e.printStackTrace();
        }
    }
}