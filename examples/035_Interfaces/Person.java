public class Person implements Cloneable 
{
    private String name;
    
    // Default constructor
    public Person( )
    {
        name = "No name yet";
    }
    
    // Parameterized constructor
    public Person(String initialName)
    {
        name = initialName;
    }
    
    // Set name method
    public void setName(String newName)
    {
        name = newName;
    }
    
    // Get name method
    public String getName( )
    {
        return name;
    }
    
    // Write output or toString method
    public void writeOutput( )
    {
        System.out.println("Name: " + name);
    }
   
    // Compare name method
    public boolean hasSameName(Person otherPerson)
    {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
    
    // Clone method
    public Object clone()
    {
    try
    {
    	return super.clone();
    }
    catch(CloneNotSupportedException e)
    {
    	System.out.println(e.getMessage());
    	return null;
    }
    }
}
