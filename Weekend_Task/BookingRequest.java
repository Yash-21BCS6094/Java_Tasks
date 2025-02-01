package Weekend_Task;
// Booking request class to represent customer name and requested ticket
public class BookingRequest {
    private String customerName = "";
    private int requestedTicket;

    // Constructor to intialize customer name and requested Tickets
    public BookingRequest(String customerName, int requestedTicket){
        this.customerName = customerName;
        this.requestedTicket = requestedTicket;
    }
    // getter for customer name
    public String getCustomerName(){
        return this.customerName;
    }
    // getter for requested ticket
    public int getRequestedTicket(){
        return this.requestedTicket;
    }
}
