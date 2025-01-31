import java.util.PriorityQueue;
import java.util.concurrent.*;

class Main{
    // This is for Thread Pool
/*    public static void main(String [] args){
        Task t1 = new Task("1st Task");
        Task t2 = new Task("2nd Task");
        Task t3 = new Task("3rd Task");
        Task t4 = new Task("4th Task");
        Task t5 = new Task("5th Task");

        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);

        pool.shutdown();

    }
 */
    // This is for semaphore
/*    public static void main(String[] args) throws InterruptedException {
        Semaphore sem = new Semaphore(1);
        MySecondThread threadA = new MySecondThread(sem, "A");
        MySecondThread threadB = new MySecondThread(sem,"B");

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println("Shared Instance: " + SharedInstance.data);
    }
 */

    // This is for Executor Service and Countdown latch
/*    public static void main(String [] args){
        CountDownLatch latch1 = new CountDownLatch(5);
        CountDownLatch latch2 = new CountDownLatch(5);
        CountDownLatch latch3 = new CountDownLatch(5);
        CountDownLatch latch4 = new CountDownLatch(5);
        CountDownLatch latch5 = new CountDownLatch(5);

        ExecutorService service = Executors.newFixedThreadPool(2);

        MyThirdThread thread1 = new MyThirdThread("A", latch1);
        MyThirdThread thread2 = new MyThirdThread("B", latch2);
        MyThirdThread thread3 = new MyThirdThread("C", latch3);
        MyThirdThread thread4 = new MyThirdThread("D", latch4);
        MyThirdThread thread5 = new MyThirdThread("E", latch5);

        service.execute(thread1);
        service.execute(thread2);
        service.execute(thread3);
        service.execute(thread4);
        service.execute(thread5);

        service.shutdown();
    }
*/

    // For process synchronization
/*    public static void main(String[] args) {
        ProcessSynchronization obj = new ProcessSynchronization();
        Thread thread1 = new Thread(()->{
           for(int i = 0; i < 5; i++){
               obj.deposit(300);
           }
        });

        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 5; i++){
                obj.withDraw(100);
            }
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(obj.getAccountBalance());

    }
 */

    // Block Synchronization
/*    public static void main(String[] args) {
        Sender send = new Sender();
        ThreadedSend obj1 = new ThreadedSend("Hi", send);
        ThreadedSend obj2 = new ThreadedSend("Bye", send);

        obj1.start();
        obj2.start();

        try{
            obj1.join();
            obj2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
 */
 /*   public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        // addition of integer elements in pq
        pq.add(1);
        pq.add(2);
        pq.add(3);

        // using peek()
        System.out.println(pq.peek());

        // looping the pq
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }

    }
  */
    public static void main(String[] args){

        PriorityBlockingQueue<Integer> pbq
                = new PriorityBlockingQueue<Integer>();

        // adding  numbers
        pbq.add(12);
        pbq.add(2);
        pbq.add(31);
        pbq.add(4);
        pbq.add(52);

        // Simply printing the pq will not give elements in ascending order
        System.out.println("PriorityBlockingQueue:" + pbq);
    }
}