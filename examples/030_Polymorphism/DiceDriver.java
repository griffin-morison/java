import java.util.Random;

public class DiceDriver {
	
    // Variable to set max number of sides on dice
    public static final int MAX_VALUE = 6;
	public static void main(String[] args) 
	{
		// Creates Random generator object
        Random ranGen1 = new Random();
		// Calls diceRolls method
        diceRolls(ranGen1);
		
        LoadedDice loadedGen = new LoadedDice();
		diceRolls(loadedGen);
	}
	
    // Dice Rolls method
    public static void diceRolls(Random ranGen)
	{
		// Creates an int array for the number of sides on dice
        int[] rollCount = new int[MAX_VALUE + 1];
		// For loop to initialize array with count zero
        for(int i = 0; i <= MAX_VALUE; i++)
		{
			rollCount[i] = 0;
		}
		
		// For loop to simulate 1000 dice rolls
        for(int i = 0; i < 1000; i++)
		{
			// Generates a random number for dice roll
            int roll = ranGen.nextInt(MAX_VALUE) + 1;
			// Increments the count for the number rolled
            rollCount[roll]++;
		}
		
        // Print header with dice values and number of rolls
		System.out.println("Value		Number of Rolls");
		// For loop to iterate through array
        for(int i = 1; i <= MAX_VALUE; i++)
		{
			// Print the number of rolls
            System.out.println(i + " 		" + rollCount[i]);
		}
	}
}
