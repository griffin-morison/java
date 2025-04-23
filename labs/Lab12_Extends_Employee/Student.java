// Student class that stores information about a Student object
// Extends the Person class
public class Student extends Person {
    // Private int variable for Student number
    private int studentNumber;

    // Default constructor
    public Student() {
        // Accesses parent class Person
        super();
        // Sets studentNumber to 0 as default
        studentNumber = 0;
    }

    // Parameterized constructor
    public Student(String initialName, int initialStudentNumber) {
        super(initialName); // this is calling the one arg Person constructor
        studentNumber = initialStudentNumber;
    }

    // Set method for name and studentNumber
    public void set(String newName, int newStudentNumber) {
        setName(newName);
        studentNumber = newStudentNumber;
    }

    // Set method for studentNumber
    public void setStudentNumber(int newStudentNumber) {
        studentNumber = newStudentNumber;
    }

    // Get method for studenetNumber
    public int getStudentNumber() {
        return studentNumber;
    }

    // toString method to print Student object
    public String toString() {
        return "Name: " + getName() + "\nStudent Number: " + studentNumber;
    }

    // boolean sameStudent method to compare Student objects
    public boolean sameStudent(Student otherStudent) {
        return getName().equalsIgnoreCase(otherStudent.getName()) && studentNumber == otherStudent.studentNumber;
    }
}
