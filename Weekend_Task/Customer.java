package Weekend_Task;

import java.util.concurrent.BlockingQueue;
// Customer class with its name, amount of tickets, queue of requests that he can make
public class Customer extends Thread{
    // Private data members
    private String name;
    private int ticketsToBook;
    private BlockingQueue<BookingRequest> que;

    // Customer constructor with name, ticketsToBook and que to intialize the data members
    public Customer(String name, int ticketsToBook, BlockingQueue<BookingRequest> que){
        this.name = name;
        this.ticketsToBook = ticketsToBook;
        this.que = que;
    }

    // Overriding run() of thread class
    @Override
    public void run(){
        try{
            // Object of bookingRequest with name and ticketsToBook
            BookingRequest request = new BookingRequest(name, ticketsToBook);
            que.put(request);
            System.out.println(name + " added a booking request for " + ticketsToBook + " tickets.");
        } catch (InterruptedException e) {
            System.out.println("Customer " + this.name + " request cannot be processed due to " +
                    "runtime error");
        }

    }
}
