import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable{
    private String taskName = "";
    public Task(String taskName){
        this.taskName = taskName;
    }
    @Override
    public void run(){
        try{
           for(int i = 0; i < 5; i++){
               Date d = new Date();
               SimpleDateFormat formatedDate = new SimpleDateFormat("hh:mm:ss");
               System.out.println("Time initialized for Task: " + this.taskName + " " + formatedDate.format(d));
           }
        } catch (RuntimeException e) {
            System.out.println("Runtime exception occured: " + e);
            e.printStackTrace();
        }
    }
}
