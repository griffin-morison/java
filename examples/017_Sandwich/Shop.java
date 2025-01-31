/**
 * Example 017: Sandwich
 * Filename: Shop.java
 * @author Griffin Morison
 *
 * Description: This java file represents the Shop class and contains
 * private variables. Shop is a public class that can be called by the ShopTestDriver. 
 * The public class has three private int double variables for sandwichesSold, myId,
 * and totalSold. In this file we also declare three functions sold, getTotal,
 * and a toString to print the variables of this class.
 *
 */

public class Shop {
    // Private variables for Shop object
    private int sandwichesSold;
	private int myId;
	private static int totalSold;
	public Shop( int id ) {
		myId = id;
		sandwichesSold = 0;
		//totalSold = 0;
	}
	// Sold method which increments the variables of the Shop
    public void sold() {
		sandwichesSold++;
		totalSold++;
	}
	// Get method to return the total
    public static int getTotal()
	{
		return totalSold;
	}
	// To String method for printing Animal
    public String toString() {
		return "Shop: " + myId + " sold " + sandwichesSold + " sandwiches";
	}
}
