/*
* Lab 3: Person Lifetime
* Filename: TestDriver.java
* Description: This java file demonstrates how to use A Test Driver file,
* which acts more as a wrapper/mechanism that organizes the tests, runs them, and 
* handles the output.
*/

public class TestDriver {
	public static void main(String[] args) {
        // Creates Person object
        Person kermit = new Person("Kermit", "The Frog", 1995, 2015);
		// String variable set to kermit first name
        String theFirstName = kermit.getFirstName();
		// Print statement for String variable
        System.out.println("Kermit's first name is: " + theFirstName);
		// Calls Boolean method to check if person is alive or not in a specified year
        kermit.checkName(2000);
	}
}
