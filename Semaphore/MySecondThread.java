import java.util.concurrent.Semaphore;

public class MySecondThread extends Thread{
    String threadName = "";
    Semaphore sem;
    MySecondThread(Semaphore sem, String threadName){
        this.threadName = threadName;
        this.sem = sem;
    }
    @Override
    public void run(){
        if(this.threadName.equalsIgnoreCase("A")){
            System.out.println(this.threadName + " Starting ");
            try {
                System.out.println(this.threadName + " is waiting for lock. ");
                sem.acquire();
                System.out.println(this.threadName + " got the lock. ");
                for(int i = 0; i < 5; i++){
                    SharedInstance.data++;
                    Thread.sleep(10);
                }

                System.out.println(this.threadName + " released the lock. ");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sem.release();
        }else{
            System.out.println(this.threadName + " Starting ");
            try{
                System.out.println(this.threadName + " is waiting for lock.");
                sem.acquire();
                System.out.println(this.threadName + " got the lock");
                for(int i = 0; i < 5; i++) {
                    SharedInstance.data--;
                    Thread.sleep(10);
                }
                System.out.println(this.threadName + " released the lock.");

            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
            sem.release();
        }
    }
}
