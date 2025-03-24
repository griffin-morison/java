
// version 1

public class Neighbor
{
    private String name;
    private int    numberOfChildren;
    private Pet    familyPet;
	

    // Default constructor
    public Neighbor()
    {
    	// Default variable values
        name = null;
    	numberOfChildren = 0;
    	familyPet = null;
    }
    
	// Parameterized constructor
    public Neighbor(String newName, int children, Pet thePet)
	{
		name = newName;
		numberOfChildren = children;
		familyPet = thePet;
	}
	
    // Copy constructor
    public Neighbor(Neighbor original)
	{
		name = original.name;
		numberOfChildren = original.numberOfChildren;
		familyPet = new Pet(original.familyPet);
		
	}
    
    // Get name method
    public String getName()
	{
		return name;
	}
    
	// Set name method
    public void setName(String newName)
	{
		name = newName;
	}
	
	// Get Number of Children method
    public int getNumberOfChildren()
	{
		return numberOfChildren;
	}
	
    // Set Number of Children method
	public void setNumberOfChildren(int howMany)
	{
		numberOfChildren = howMany;
	}
	
	// Get Pet method
    public Pet getPet( )
    {
        return familyPet;
    }
	
	// Set Pet method
    public void setPet(Pet thePet)
	{
		familyPet = thePet;
	}
		
	// toString method
    public String toString( )
    {
        return "Neighbor: " + name + "\nNumber of children: " + numberOfChildren
        		+ "\nTheir Pet:\n" + familyPet;
		
	}
}
