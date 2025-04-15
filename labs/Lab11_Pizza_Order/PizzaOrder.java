// PizzaOrder class that stores information about a pizza order.
public class PizzaOrder {

    // Final int value for max number of pizzas
    private static final int MAX_NUM_PIZZAS = 10;
    // Private Pizza array
    private Pizza[] pizza;
    // Private int for number of pizzas
    private int numPizzas;

    // Default constructor
    public PizzaOrder() {
        // Create new Pizza array of max size 10
        pizza = new Pizza[MAX_NUM_PIZZAS];
        // Set number of pizzas to 0
        numPizzas = 0;
    }

    // Paramertized constructor
    public PizzaOrder(PizzaOrder original) {
        // Set pizza array and number of pizzas equal to input
        pizza = original.pizza;
        numPizzas = original.numPizzas;
    }

    // Method to add pizza to the order
    public void addPizza(Pizza p) {
        // If number of pizzas is greater than max number of pizzas 10
        if (numPizzas >= MAX_NUM_PIZZAS) {
            // Print too many pizzas for order
            System.out.println("Too many pizzas for this order");
        }
        // Else add pizza to pizza array and increment number of pizzas
        else {
            pizza[numPizzas] = p;
            numPizzas++;
        }
    }

    // Get method to return the number of pizzas in the order
    public int getNumPizzas() {
        return numPizzas;
    }

    // Changes the toppings on a specific pizza precondition: 0 <= pizzaNumber <
    // numPizzas
    public void changePizzaToppings(int pizzaNumber, int numCheeseToppings, int numHamToppings,
            int numPepperoniToppings) {
        // If pizza number less than 0 or greater than max number 10
        if (pizzaNumber < 0 || pizzaNumber > numPizzas) {
            // Print error invalid pizza number
            System.out.println("Invalid pizza number");
        }
        // Else
        else {
            // Set pizza toppings equal to inputs
            pizza[pizzaNumber].setNumCheeseToppings(numCheeseToppings);
            pizza[pizzaNumber].setNumHamToppings(numHamToppings);
            pizza[pizzaNumber].setNumPepperoniToppings(numPepperoniToppings);
        }
    }

    // Method to print the entire pizza order
    public void printOrder() {
        // For loop to iterate the pizza array
        for (int i = 0; i < numPizzas; i++) {
            // Print pizza
            System.out.println(pizza[i]);
        }
        // Print order total
        System.out.println("Order Total: $" + calcTotal());
    }

    // Method to calculate the total cost of an order
    public double calcTotal() {
        // Variable to store total
        double total = 0;
        // For loop to iterate through pizza array
        for (int i = 0; i < numPizzas; i++) {
            // Increment total by cost of pizza
            total += pizza[i].calcCost();
        }
        // Return total
        return total;
    }
}
