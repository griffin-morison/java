public class PizzaOrderDriver {

    public static void main(String[] args) {

        // Create Pizza object 'myPizza'
        Pizza myPizza = new Pizza("Large", 1, 0, 1);
        // Create Pizza object 'anotherPizza'
        Pizza anotherPizza = new Pizza("Medium", 2, 2, 0);

        // Create PizzaOrder object 'order1'
        PizzaOrder order1 = new PizzaOrder();
        // Add 'myPizza' to 'order1'
        order1.addPizza(myPizza);
        // Add 'anotherPizza' to 'order1'
        order1.addPizza(anotherPizza);
        // Print Order 1
        System.out.println("Order 1:");
        // Print PizzaOrder object 'order1'
        order1.printOrder();

        // Create PizzaOrder object 'order2'
        PizzaOrder order2 = new PizzaOrder(order1);
        // Call change toppings method
        order2.changePizzaToppings(1, 6, 0, 4);
        // Print Order 2
        System.out.println("Order 2:");
        // Print PizzaOrder object 'order2'
        order2.printOrder();
    }
}