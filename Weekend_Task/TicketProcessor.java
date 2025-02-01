package Weekend_Task;

import java.util.concurrent.BlockingQueue;
// Processor class for processing the requested tickets by the Customer
public class TicketProcessor extends Thread{
    // Initiating the TicketCounter and BlockingQueue
    private TicketCounter ticketCounter;
    private BlockingQueue<BookingRequest> que;

    // TicketProcessor Constructor for intializing the above mentioned data members
    public TicketProcessor(TicketCounter ticketCounter, BlockingQueue<BookingRequest> que){
        this.ticketCounter = ticketCounter;
        this.que = que;
    }
    // Overriding run() from Thread class
    @Override
    public void run(){
        try{
           while(true){
               BookingRequest request = que.take();
               ticketCounter.bookTicket(request.getCustomerName(),
                                        request.getRequestedTicket());
               Thread.sleep(100);
           }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
