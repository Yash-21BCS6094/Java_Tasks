package Weekend_Task;

public class BookingRequest {
    private String customerName = "";
    private int requestedTicket;

    public BookingRequest(String customerName, int requestedTicket){
        this.customerName = customerName;
        this.requestedTicket = requestedTicket;
    }
    public String getCustomerName(){
        return this.customerName;
    }

    public int getRequestedTicket(){
        return this.requestedTicket;
    }
}
