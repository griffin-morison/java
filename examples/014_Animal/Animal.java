/**
 * Example 014: Animal
 * Filename: Animal.java
 * @author Griffin Morison
 *
 * Description: This java file represents the Animal class and contains
 * private variables. Animal is a public class that can be called by
 * the Test Driver. The public class has three private variables for 
 * Name, Species, and Color. In this file we show how public constructors 
 * can be called based on how many variables they take as input.
 *
 */


public class Animal {
	// Private variables for Person object
    private String Name;
	private String Species;
	private String Color;
	// Public constructor method which takes all variables as inputs
    public Animal(String name, String species, String color) {
		Name = name;
		Species = species;
		Color = color;
	}
	// Public constructor method which takes no variables as inputs
    public Animal(){
		this("Kermit", "Frog","Green");
	}
	// Public constructor method which takes name variable as input
    public Animal(String name){
		this(name, "Bear", "Black");
	}
	// Public constructor method which takes name and species variables as inputs
    public Animal(String name, String species){
		this(name, species, "White");
	}
	// Get method for animal name
    public String getName() {
		return Name;
	}
	// Set method for animal name
    public void setName( String Name ){
		this.Name = Name;
	}
	// Get method for animal species
    public String getSpecies() {
		return Species;
	}
	// Set method for animal species
    public void setSpecies( String Species ){
		this.Species = Species;
	}
	// Get method for animal color
    public String getColor () {
		return Color;
	}
	// Set method for animal color
    public void setColor( String Color ){
		this.Color = Color;
	}
	// To String method for printing Animal
    public String toString(){
		return Name + "," + Species + "," + Color;
		
	}
}
