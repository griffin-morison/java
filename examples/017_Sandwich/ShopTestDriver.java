/*
* Examples 017: Sandwich
* Filename: ShopTestDriver.java
* Description: This java file will test the Shop class. This test driver 
* creates Shop objects and tests the functions of the class by printing
* results to the console.
*/

public class ShopTestDriver {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
		
        // Creates Shop objects
        Shop one = new Shop (1);
		Shop two = new Shop (2);
		Shop three = new Shop (3);
		
		// Calls sold method for Shop one and two
        one.sold();
		two.sold();
		// For loop that calls sold method for Shop three 100 times
        for ( int i = 0; i <100; i++) {
			three.sold();
		}
		// Prints Shops toString method
		System.out.println ( one );
		System.out.println ( two );
		System.out.println ( three );
		// Prints total sold by all Shop objects
        System.out.println ( "Total Sold is: " + Shop.getTotal() );
    } 
}
