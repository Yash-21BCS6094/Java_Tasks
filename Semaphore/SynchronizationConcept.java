public class SynchronizationConcept {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread th1 = new MyThread(counter);
        MyThread th2 = new MyThread(counter);
        th1.start();
        th2.start();
        
        try{
            th1.join();
            th2.join();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(counter.getCount());
    }
}
