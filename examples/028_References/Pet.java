public class Pet
{
    private String name;
    private int age;       //in years
    private double weight; //in pounds
    
    // Default constructor 
    public Pet( )
    {
        // Default varaible values
        name = "No name yet.";
        age = 0;
        weight = 0; 
    }
    // Parameterized constructor
    public Pet(String initialName, int initialAge, double initialWeight)
    {
        // Set name
        name = initialName;
        // Edge case to check that age and weight greater than zero
        if ((initialAge < 0) || (initialWeight < 0)) {
            throw new IllegalArgumentException("Error: Negative age or weight.");
        }
        // Set age and weight
        age = initialAge;
        weight = initialWeight;
    }
	
    // Copy constructor
    public Pet(Pet original)
    {
    	if (original == null) {
            throw new IllegalArgumentException("Cannot copy from a null Pet object.");
        }
        name = original.name;
    	age = original.age;
    	weight = original.weight;
    }
     
    // Set name method
    public void setName(String newName)
    {
        name = newName;
    }
    
    // Set age method 
    public void setAge(int newAge)
    {
        // Check age is greater than zero
        if (newAge < 0){
            throw new IllegalArgumentException("Error: Negative age.");
        }
        // Set age
        age = newAge;
    }

    // Set weight method
    public void setWeight(double newWeight)
    {
        // Check weight is greater than zero
        if (newWeight < 0){
            throw new IllegalArgumentException("Error: Negative weight.");
        }
        // Set weight
        weight = newWeight;
    }
    
    // Get name method
    public String getName( )
    {
        return name;
    }
    
    // Get age method
    public int getAge( )
    {
        return age;
    }
    
    // Get weight method
    public double getWeight( )
    {
        return weight;
    }

    // toString method
    public String toString( )
    {
        return "Name: " + name + "\nAge: " + age + "\nWeight: " + weight;
       
    }
    
    // Compare method
    public boolean equals(Pet p)
    {
    	// Check Pet object not null
        if (p == null)
    	{
    		return false;
    	}
    	// Return true if Pet objects equal
        else
    	{
    		return name.equals(p.name) && age == p.age && weight == p.weight;
    	}
    }
    
    public static void changer(int i)
    {
    	i++;	
    }
    
    public static void changer(Pet p)
    {
        if (p != null) {
            p.setAge(p.getAge() + 1);
        }
    }
}
