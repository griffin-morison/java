/*
* Lab 3: Person Lifetime
* Filename: Book.java
* Description: This java file will demonstrate how to initialze 
* variables, run operations on variables, and print lines, using the example of
* a Book. 
*/

public class Person {
	// Private variables for Person object
    private String myFirstName;
	private String myLastName;
	private int myBirthYear;
	private int myDeathYear;
	// Public constructor method which takes variables as inputs
    public Person( String first, String second, int birth, int death ) {
		myFirstName = first;
		myLastName = second;
		myBirthYear = birth;
		myDeathYear = death;
	}
	// Get method for person first name
    public String getFirstName() {
		return myFirstName;
	}
	// Get method for person last name
    public String getLastName() {
		return myLastName;
	}
	// Get method for person birth year
    public int getBirthYear() {
		return myBirthYear;
	}
	// Get method for person death year
    public int getDeathYear() {
		return myDeathYear;
	}
	// Boolean method to check if person is alive or not in a specified year
    public boolean checkName( int year) {
		if((year >= myBirthYear) && (year <= myDeathYear)) {
			System.out.println( getFirstName() + " was alive in " + year);
			return true;
        }
        System.out.println( getFirstName() + " was not alive in " + year);
        return false;
	}
	// Boolean method to check if person objects equal each other
    public boolean equals( Person otherPerson) {
		return myFirstName.equals( otherPerson.getFirstName() ) &&
				myLastName.equals( otherPerson.getLastName() );
	}
	// To String method for printing Person
    public String toString() {
        return myFirstName + " " + myLastName + " " + myBirthYear + " " + myDeathYear;
    }
}