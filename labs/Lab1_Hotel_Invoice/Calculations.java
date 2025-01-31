/*
* Lab 1: Hotel Invoive
* Filename: Calculations.java
* Description: This java file will demonstrate how to initialze 
* variables, run operations on variables, and print lines, using the example of
* a Hotel Invoice. 
*/

public class Calculations {
    public static void main(String[] args) {
        // Prints invoive header
		System.out.println( "Invoice for the Four Season");
		// Declare variables for invoice using int and double
		int Nights;
		int CostPerNight;
		double RoomRate;
		double LocationRate;
		double RoomTax;
		double LocationTax;
		double TotalCostPerNight;
		
		// Initialize variables for invoce
		Nights = 4;
		CostPerNight = 1000;
		RoomRate = 0.0675;
		LocationRate = 0.0125;
		RoomTax = RoomRate * CostPerNight;
		LocationTax = LocationRate * CostPerNight;
		TotalCostPerNight = CostPerNight + RoomTax + LocationTax;
		
		// Print invoice with calculations of cost
		System.out.println("Cost per Night: $" + CostPerNight);
		System.out.println("Room Taxes per night: @Rate of 6.75% is $" + RoomTax);
		System.out.println("Location Taxes per night: @Rate of 1.25% is $" +LocationTax);
		System.out.println("Total Cost per night: $" + TotalCostPerNight);
		System.out.println("Number of nights Stayed:" + Nights);
		System.out.println("Total Cost: $" + TotalCostPerNight * Nights);

    }
    
}
