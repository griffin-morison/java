public class TicketDemo {

    public static void main(String[] args) {

        // Creates a Ticket array of size 5
        Ticket[] ticket = new Ticket[5];
        // Adds WalkupTicket in index 0
        ticket[0] = new WalkupTicket(); // $50
        // Adds AdvanceTicket (11 days) in index 1
        ticket[1] = new AdvanceTicket(11); // $30
        // Adds AdvanceTicket (9 days) in index 2 
        ticket[2] = new AdvanceTicket(9); // $40
        // Adds StudentAdvanceTicket (15 days) in index 3
        ticket[3] = new StudentAdvanceTicket(15); // $15
        // Adds StudentAdvanceTicket (5 days) in index 4
        ticket[4] = new StudentAdvanceTicket(5); // $20

        // For loop to interate through Ticket array
        for (int i = 0; i < 5; i++) {
            // Print Ticket array
            System.out.println(ticket[i].toString());
        }
    }
}
