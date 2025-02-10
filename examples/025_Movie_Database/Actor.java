
public class Actor {
    private String firstName = "";
    private String lastName = "";

    // Default Constructor
    public Actor() {
        this.firstName = "";
        this.lastName = "";
    }

    // Actor Constructor
    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and Setters
    // Set method for first name
    public void setFirstName(String firstNameToSet) {
        this.firstName = firstNameToSet;
    }
    // Get method for first name
    public String getFirstName() {
        return firstName;
    }
    // Set method for last name
    public void setLastName(String lastNameToSet) {
        this.lastName = lastNameToSet;
    }
    // Get method for last name
    public String getLastName() {
        return lastName;
    }

    // toString() method
    public String toString() {
        return firstName + " " + lastName;
    }
}
