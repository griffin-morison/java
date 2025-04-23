// AdvanceTicket class that stores information about a AdvanceTicket object
// Extends the Ticket class
public class AdvanceTicket extends Ticket {
    // Private variables for daysInAdvance, earlybirdPrice, and advancePrice
    private int daysInAdvance;
    private int earlybirdPrice = 30; // $30
    private int advancePrice = 40; // $40

    // Parameterized constructor
    public AdvanceTicket(int days) {
        daysInAdvance = days;
    }

    // getPrice method
    public int getPrice() {
        // If greater than or equal to 10 daysInAdvance
        if (getDaysInAdvance() >= 10) {
            // Return earlybirdPrice ($30)
            return earlybirdPrice;
        } else {
            // Else return advancePrice ($40)
            return advancePrice;
        }
    }

    // getDaysInAdvance method
    public int getDaysInAdvance() {
        return daysInAdvance;
    }
}
