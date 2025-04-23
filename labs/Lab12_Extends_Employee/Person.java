// Person class that stores information about a Person object
public class Person {
    // Private String variable for name
    private String name;

    // Default constructor
    public Person() {
        // Sets name to "No name yet" as default
        name = "No name yet";
    }

    // Parameterized constructor
    public Person(String initialName) {
        name = initialName;
    }

    // Set name method
    public void setName(String newName) {
        name = newName;
    }

    // Get name method
    public String getName() {
        return name;
    }

    // toString method to print Person object
    public String toString() {
        return "Name: " + name;
    }

    // boolean sameName method to compare Person objects
    public boolean sameName(Person otherPerson) {
        return name.equalsIgnoreCase(otherPerson.name);
    }
}
