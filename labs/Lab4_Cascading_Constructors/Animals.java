/*
* Lab 4: Cascading Constructors
* Filename: Animals.java
* Description: This java file will demonstrate how to initialze different types of constructors.
* Default constructors takes no parameters or have parameters with default values, essentially 
* allowing an object to be created without explicitly providing any values. While a 
* General Constructor takes parameters, allowing for customized initialization of an object with 
* specific values when created. 
*/

public class Animals {
    // Private variables for name, species, and color of Animal object
    private String Name;
    private String Species;
    private String Color;

    // General constructor takes input for name, species, and color of Animal object 
    public Animals(String name, String species, String color) {
        Name = name;
        Species = species;
        Color = color;
    }
    // Default constructor that takes no parameters
    public Animals() {
        this("Kermit", "Frog", "Green");
    }
    // This constructor only takes input for name
    public Animals(String name) {
        this(name, "Bear", "Black");
    }
    // Whereas this constructor takes input for name and species
    public Animals(String name, String species) {
        this(name, species, "White");
    }
    // Get method that returns name of Animal
    public String getName() {
        return Name;
    }
    // Get method that returns species of Animal
    public String getSpecies() {
        return Species;
    }
    // Get method that returns color of Animal
    public String getColor() {
        return Color;
    }
    // String method to print the name, species, and color of Animal
    public String toString() {
        return Name + "," + Species + "," + Color;

    }
}
