public class Sender {
    void send(String message){
        System.out.println("Sending " + message);
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(message + " Sent ");
    }
}
