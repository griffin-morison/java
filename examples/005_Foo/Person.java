/*
* Examples 005: Foo
* Filename: Person.java
* Description: This java file will demonstrate how classes and
* private and public variables work.
* Person is a public class that can be called by Foo.
* The public class has four private variables for firstname, lastname, 
* birth year, and death year. The public constructor takes in those
* variables as input. This class also utilizes get, boolean, and String methods. 
*/

public class Person {
    // Private variables that descibe Person object
    private String myFirstName;
    private String myLastName;
    private int myBirthYear;
    private int myDeathYear;

    // Public constructor that takes in four inputs
    public Person(String first, String second, int birth, int death) {
        myFirstName = first;
        myLastName = second;
        myBirthYear = birth;
        myDeathYear = death;
    }

    // Get method for firstname
    public String getFirstName() {
        return myFirstName;
    }
    // Get method for lastname
    public String getLastName() {
        return myLastName;
    }
    // Get method for birth year
    public int getBirthYear() {
        return myBirthYear;
    }
    // Get method for death year
    public int getDeathYear() {
        return myDeathYear;
    }
    // Boolean method to check if Person was alive or dead
    public boolean checkName(int year) {
        // If input year is greater than or equal to birth year
        // And input year is less than or equal to death year
        // Return true
        if ((year >= myBirthYear) && (year <= myDeathYear)) {
            System.out.println(getFirstName() + " was alive in " + year);
            return true;
        }
        // Else return false
        System.out.println(getFirstName() + " was not alive in " + year);
        return false;
    }
    // String method to access private variables of Person object
    public String toString() {
        return myFirstName + myLastName + myBirthYear + myDeathYear;
    }
}
