/*
* Examples 008: File Example
* Filename: Person.java
* Description: This java file will demonstrate how classes and
* public variables work. Person is a public class that can be called by
* FileTest Driver. The public class has four private variables for 
* firstname, lastname, birth year, and death year. The public 
* constructor takes in those variables as input.
*/

public class Person {
    // Private variables for Person object
    private String firstName;
    private String lastName;
    private int birthYear;
    private int deathYear;

    // Public constructor method which takes variables as inputs
    public Person(String firstName2, String lastName2, int birthYear2, int deathYear2) {
        this.firstName = firstName2;
        this.lastName = lastName2;
        this.birthYear = birthYear2;
        this.deathYear = deathYear2;
    }
    // To String method for printing Person
    public String toString() {
        return firstName + " " + lastName + " (" + birthYear + " - " + deathYear + ")";
    }
}
