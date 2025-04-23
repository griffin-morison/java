// Doctor class that stores information about a Doctor object
// Extends the Person class
public class Doctor extends Person {
    // Private variables for specialty and officeVisitFee
    private String specialty;
    private int officeVisitFee;

    // Default constructor
    public Doctor() {
        // Accesses Person object
        super();
        // Sets variables to default values
        specialty = "Unknown";
        officeVisitFee = 0;
    }

    // Parameterized constructor
    public Doctor(String initialName, String initialSpecialty, int initialOfficeVisitFee) {
        super(initialName); // this is calling the one arg Person constructor
        // Sets variables equal to args
        specialty = initialSpecialty;
        officeVisitFee = initialOfficeVisitFee;
    }

    // Set method for name, specialty, and officeVisitFee variables
    public void set(String newName, String newSpecialty, int newOfficeVisitFee) {
        setName(newName);
        specialty = newSpecialty;
        officeVisitFee = newOfficeVisitFee;

    }

    // Set specialty method
    public void setSpecialty(String newSpecialty) {
        specialty = newSpecialty;
    }

    // Get specialty method
    public String getSpecialty() {
        return specialty;
    }

    // Set officeVisitFee method
    public void setOfficeVisitFee(int newOfficeVisitFee) {
        officeVisitFee = newOfficeVisitFee;
    }

    // Get officeVisitFee method
    public int getOfficeVisitFee() {
        return officeVisitFee;
    }

    // bolean method to compare Doctor objects
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        }
        if (this.getClass() != otherObject.getClass()) {
            return false;
        }
        Doctor otherDoctor = (Doctor) otherObject;
        return (this.sameName(otherDoctor) && this.specialty.equals(otherDoctor.specialty)
                && this.officeVisitFee == otherDoctor.officeVisitFee);
    }

    // toString method to print Doctor object
    public String toString() {
        return "Name: " + getName() + "\nSpecialty: " + specialty + "\nOffice Fee: " + officeVisitFee;
    }

}
