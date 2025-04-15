// Pizza class that stores information about a single pizza.
public class Pizza {

    // Final String values for Pizza sizes
    public static final String SMALL = "Small";
    public static final String MEDIUM = "Medium";
    public static final String LARGE = "Large";

    // Private variables for size, cheese, ham, and pepperoni toppings
    private String size;
    private int numCheeseToppings;
    private int numHamToppings;
    private int numPepperoniToppings;

    // Default or no argument constructor
    public Pizza() {
        // Sets default values
        size = "Large";
        numCheeseToppings = 1;
        numHamToppings = 0;
        numPepperoniToppings = 0;
    }

    /*
     * Paramertized constructor
     * Takes 4 arguments: size of pizza, num of cheese toppings,
     * num of ham toppings, num of pepperoni toppings
     */
    public Pizza(String pizzaSize, int cheese, int ham, int pepperoni) {
        // Check edge cases for Pizza sizes
        if (!(pizzaSize == SMALL || pizzaSize == MEDIUM || pizzaSize == LARGE)) {
            // if size is invalid, set size to SMALL
            size = SMALL;
        } else {
            // Otherwise, set Pizza size to input
            size = pizzaSize;
        }
        // Set topping variables as inputs
        numCheeseToppings = cheese;
        numHamToppings = ham;
        numPepperoniToppings = pepperoni;
    }

    // Pizza copy object
    public Pizza(Pizza original) {
        // Set variables equal to input Pizza object
        size = original.size;
        numCheeseToppings = original.numCheeseToppings;
        numHamToppings = original.numHamToppings;
        numPepperoniToppings = original.numPepperoniToppings;
    }

    // Get size method
    public String getSize() {
        return size;
    }

    // Get cheese toppings method
    public int getNumCheeseToppings() {
        return numCheeseToppings;
    }

    // Get ham toppings method
    public int getNumHamToppings() {
        return numHamToppings;
    }

    // Get pepperoni toppings method
    public int getNumPepperoniToppings() {
        return numPepperoniToppings;
    }

    // Set cheese toppings method
    public void setNumCheeseToppings(int cheese) {
        numCheeseToppings = cheese;
    }

    // Set ham toppings method
    public void setNumHamToppings(int ham) {
        numHamToppings = ham;
    }

    // Set pepperoni toppings method
    public void setNumPepperoniToppings(int pepperoni) {
        numPepperoniToppings = pepperoni;
    }

    // Calculates the cost of the pizza
    public double calcCost() {
        // Set baseCost as 10
        double baseCost = 10;
        // If size SMALL
        if (size.equals(SMALL)) {
            // baseCost is 10
            baseCost = 10;
        }
        // Else if size MEDIUM
        else if (size.equals(MEDIUM)) {
            // baseCost is 12
            baseCost = 12;
        }
        // Else if size LARGE
        else if (size.equals(LARGE)) {
            // baseCost is 14
            baseCost = 14;
        }
        // Else is size invalid
        else {
            // Print error
            System.out.println("Error, unknown size.");
            return 0;
        }
        // Return total cost plus toppings
        return baseCost + (numHamToppings + numCheeseToppings + numPepperoniToppings) * 2;
    }

    // toString method
    public String toString() {
        return "Size: " + size + ", Cheese Toppings: " + numCheeseToppings + " Pepperoni Toppings: "
                + numPepperoniToppings + " Ham Toppings: " + numHamToppings + ". Cost: " + calcCost();
    }

}
