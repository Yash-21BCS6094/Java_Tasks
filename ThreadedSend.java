public class ThreadedSend extends  Thread{
    String msg = "";
    Sender sender;
    ThreadedSend(String msg, Sender sender){
        this.msg = msg;
        this.sender = sender;
    }
    @Override
    public void run(){
        synchronized (sender){
            sender.send(msg);
        }
    }
}
