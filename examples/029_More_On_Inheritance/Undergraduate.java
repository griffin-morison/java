public class Undergraduate extends Student{
	// 1 for freshman, 2 for sophomore
	// 3 for junior, 4 for senior
	private int level;
	
	// Default constructor
    public Undergraduate()
	{
		super();
		level = 1;
	}
	
	// Parameterized constructor
    public Undergraduate(String initialName, int initialStudNumber, int initialLevel)
	{
		super(initialName, initialStudNumber);
		//level = initialLevel;
		setLevel(initialLevel);
	}
	
	// Set level method
    public void setLevel(int newLevel)
	{
		if(newLevel >= 1 && newLevel <= 4)
		{
			level = newLevel;
		}
		else
		{
			level = 1;
		}
	}
	
	// Get level method
    public int getLevel()
	{
		return level;
	}
	
	// Set method
    public void set(String newName, int newStudentNumber, int newLevel)
	{
		set(newName, newStudentNumber);
		setLevel(newLevel);
	}
	
	// toString method
    public String toString()
	{
		return super.toString() + "\nStudent Level: " + level;
	}
}
