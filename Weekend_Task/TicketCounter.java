package Weekend_Task;

public class TicketCounter {
    // Available tickets for booking
    private int availableTickets = 0;

    // Synchronized method for making booking by the requested customer
    public synchronized boolean bookTicket(String customerName, int requestedTicket){
        // Condition to check number of requested ticket
        if(requestedTicket <= availableTickets){
            // If available ticket is greater than the requested ticket subtract it
            availableTickets -= requestedTicket;
            // Printing the status
            System.out.println(customerName + " has successfully booked " + requestedTicket);
            System.out.println("We are left with " + availableTickets);
            // If the conditions holds then immediately return true
            return true;
        }else{
            // If the condition does not hold immediately return false
            System.out.println("We do not have requested tickets: ");
            return false;
        }
    }
    // setter for available tickets
    public void setAvailableTickets(int availableTickets){
        this.availableTickets = availableTickets;
    }

    // getter for available tickets
    public int getAvailableTickets(){
        return this.availableTickets;
    }
}
