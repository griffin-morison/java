public class Person
{
    private String name;
    
    // Default constructor
    public Person( )
    {
    	System.out.println("Person: no arg constructor called");
        name = "No name yet";
    }
    
    // Parameterized constructor
    public Person(String initialName)
    {
    	System.out.println("Person: one arg constructor called");
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
    
    // toString method
    public String toString( )
    {
        return "Name: " + name;
    }
   
    // Compare name method
    public boolean sameName(Person otherPerson)
    {
        return name.equalsIgnoreCase(otherPerson.name);
    }
}

