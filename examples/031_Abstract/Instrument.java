public abstract class Instrument {
	private String name;
	
	// Parameterized constructor
    public Instrument(String name)
	{
		this.name = name;
	}
	
	// Get name method
    public String getName()
	{
		return name;
	}
	
	// Play method
    abstract public void play();
	
}
