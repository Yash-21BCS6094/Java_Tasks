package Weekend_Task;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TicketManagementSystem {
    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter();
        BlockingQueue<BookingRequest> queue = new LinkedBlockingQueue<>(10);
        Vector<Customer> customers = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        TicketProcessor ticketProcessor = new TicketProcessor(ticketCounter, queue);
        ticketProcessor.start();

        System.out.println("Welcome to Big-Oh Ticketing Service System");

        boolean running = true;
        while (running) {
            System.out.println("\nOptions:");
            System.out.println("1. Add New Customer");
            System.out.println("2. Set Tickets Available");
            System.out.println("3. Start Execution and Process Requests");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter Number of Tickets to Book: ");
                    int tickets = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Customer newCustomer = new Customer(customerName, tickets, queue);
                    customers.add(newCustomer);
//                    newCustomer.start();
                    break;

                case 2:
                    System.out.print("Enter the New Number of Available Tickets: ");
                    int newTickets = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    ticketCounter.setAvailableTickets(newTickets);
                    break;

                case 3:
                    System.out.println("Processing all booking requests...");
                    for(Customer currCustomer: customers){
                        currCustomer.start();
                    }
                    running = false; // Stop taking new inputs
                    break;

                case 4:
                    System.out.println("Exiting the system.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        // Wait for all customers to finish
        for (Customer customer : customers) {
            try {
                customer.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        // Allow ticket processor to finish processing remaining requests
        while (!queue.isEmpty()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Stop ticket processor safely
        ticketProcessor.stopProcessing();
        try {
            ticketProcessor.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All bookings processed. System shutting down.");
        scanner.close();
    }
}
