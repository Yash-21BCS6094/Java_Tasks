package Weekend_Task;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TicketManagementSystem {
    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter();
        BlockingQueue<BookingRequest> que = new LinkedBlockingQueue<>(10);

        // Start consumer thread
        TicketProcessor tktProcessor = new TicketProcessor(ticketCounter, que);
        Thread processor = new Thread(tktProcessor);

        // Thread of customers
        Thread[] customers = new Thread[]{
                new Customer("Yash", 1, que),
                new Customer("Sumit", 2, que),
                new Customer("Amandeep", 12, que),
                new Customer("Pankaj", 5, que),
        };

        for(Thread customer: customers){
            customer.start();
        }

        for(Thread customer: customers){
            try{
                customer.join();
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }

        processor.interrupt();

    }
}
