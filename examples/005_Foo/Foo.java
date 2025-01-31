/*
* Examples 005: Foo
* Filename: Foo.java
* Description: This java file will demonstrate how to use a Main Test Driver file,
* which acts more as a wrapper/mechanism that organizes the tests, runs them, and 
* handles the output.
*/

public class Foo {
    public static void main(String[] args) {
        // Creates Person object
        Person kermit = new Person("Kermit", "The Frog", 1995, 2015);
	    // Creates String variables for firstname using get method
        String theFirstName = kermit.getFirstName();
	    // Prints firstname variable of Person
        System.out.println("Kermit's first name is: " + theFirstName);
	    // Checks if Person is alive or dead using boolean method
        kermit.checkName(2000); 
    }
}
