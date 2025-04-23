// StudentAdvanceTicket class that stores information about a StudentAdvanceTicket object
// Extends the Ticket class
public class StudentAdvanceTicket extends AdvanceTicket{
	// Private variables for earlybirdStudent, and advanceStudent prices
    private int earlybirdStudent = 15; // $15
	private int advanceStudent = 20; // $20
	
	// Parameterized constructor
    public StudentAdvanceTicket(int days)
	{
		super(days);
	}

	// getPrice method
    public int getPrice()
	{
		return super.getPrice()/2;
	}
}
