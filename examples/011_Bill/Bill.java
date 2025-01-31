/**
 * Example 011: Bill
 * Filename: Bill.java
 * @author Griffin Morison
 *
 * Description: Program inputs the name, quality, and price of three items. 
 * Output a bill with a tax rate 0f 6.25%. All prices output to two decimals places. 
 * The bill is formated with 30 characters for a name, 10 characters for the
 * quantity, 10 characters for the price, and 10 characters for the total.
 * 
 * Sample input and output
 * 
 * Your bill:
 * 
 * Item			Quantity		Price		Total
 * lollipop		    10			0.50		5.00
 * diet soda		3			1.25		3.75
 * chocolate bar	20			0.75		15.00
 * 
 * Subtotal									23.75
 * 6.25% sales tax							1.48
 * Total									25.23
 *
 */

import java.util.Scanner;

public class Bill {
    // Double for tax percentage
    public static final double TAX = 0.0625;
    public static void main(String[] args) {
        // Creates Scanner object
        Scanner input = new Scanner(System.in);
		// String array for item names, size 3
        String[] itemName = new String[3];
		// Interger array for quanties, size 3
        int[] quantity = new int[3];
		// Double array for prices, size 3
        double[] price = new double[3];
		// Double array for item total, size 3
        double[] itemTotal = new double[3];
		// Double subtotal set to zero, double variables for salestax and total
        double subTotal = 0, salesTax, total;

		//Inputs information for each item
		for(int i = 0; i < 3; i++){
            // Print and store item name
            System.out.println("Input name of item " + (i + 1) + ":");
			itemName[i] = input.nextLine();
			// Print and store quantity of item
			System.out.println("Input quantity of item " + (i + 1) + ":");
			quantity[i] = input.nextInt();
			// Print and store price of item
			System.out.println("Input price of item " + (i + 1) + ":");
			price[i] = input.nextDouble();
			
            // Calculates item totals
			input.nextLine();
			itemTotal[i] = quantity[i] * price[i];
		}
		// Close input Scanner
        input.close();
		
		//Adds the total cost of items for Subtotal 
		for(double x : itemTotal)
			subTotal += x;
		
		//Calculates Tax and Total cost
		salesTax = subTotal * TAX;
		total = subTotal + salesTax;
		
		//Outputs results for the bill
		System.out.println("Your bill:");
		System.out.printf("%-30s %-10s %-10s %-10s%n", "Item", "Quantity", "Price", "Total");
		System.out.printf("%-30s %-10d %-10.2f %-10.2f%n", itemName[0], quantity[0], price[0], itemTotal[0]);
		System.out.printf("%-30s %-10d %-10.2f %-10.2f%n", itemName[1], quantity[1], price[1], itemTotal[1]);
		System.out.printf("%-30s %-10d %-10.2f %-10.2f%n%n", itemName[2], quantity[2], price[2], itemTotal[2]);
		System.out.printf("%-30s %-10s %-10s %-10.2f%n", "Subtotal", "", "", subTotal);
		System.out.printf("%-30s %-10s %-10s %-10.2f%n", "6.25% sales tax", "", "", salesTax);
		System.out.printf("%-30s %-10s %-10s %-10.2f%n", "Total", "", "", total);
    }
}
