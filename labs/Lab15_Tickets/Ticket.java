// Ticket class that stores information about a Ticket object
// Extends the Fruit class
public abstract class Ticket {
    // Private variables for nextNumber, ticketNumber, and ticketPrice
    private static int nextNumber;
    private int ticketNumber;
    private int ticketPrice;

    // Default constructor
    public Ticket() {
        // Increment nextNumber
        nextNumber++;
        // Set ticketNumber equal to nextNumber
        ticketNumber = nextNumber;
    }

    // getPrice method
    public abstract int getPrice();

    // toString method to print Ticket object
    public String toString() {
        return "Ticket Number: " + ticketNumber + ", " + "Price: $" + getPrice();
    }

}
