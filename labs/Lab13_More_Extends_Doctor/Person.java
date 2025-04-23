// Person class that stores information about a Person object
public class Person {
    // Private String variable for name
    private String name;

    // Default constructor
    public Person() {
        // Prints that default no arg constructor was called
        System.out.println("Person: no arg constructor called");
        // Sets name as "No name yet" as default
        name = "No name yet";
    }

    // Parameterized constructor
    public Person(String initialName) {
        // Prints that parameterized arg constructor was called
        System.out.println("Person: one arg constructor called");
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

    // boolean method to compare Person objects
    public boolean sameName(Person otherPerson) {
        return name.equalsIgnoreCase(otherPerson.name);
    }
}
