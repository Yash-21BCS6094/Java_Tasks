package Synchronization;

public class Main {
    public static void main(String[] args) {
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
}
