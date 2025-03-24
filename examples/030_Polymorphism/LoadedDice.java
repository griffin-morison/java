import java.util.Random;

public class LoadedDice extends Random{
	
    // Default constructor
    public LoadedDice()
	{
		super();
	}
	
	// Loaded dice method
    public int nextInt(int num)
	{
		int chance = super.nextInt(2);
		if(chance == 0) // fair dice
		{
			return super.nextInt(num);
		}
		else //loaded die
		{
			return num - 1;
		}
	}
}

