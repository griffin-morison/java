// Employee class that stores information about a Student object
// Extends the Person class
public class Employee extends Person{
	// Private String variable for employeeID
    private String employeeID;
	// Private double variable for salary
    private double salary;
	
	// Default constructor for Employee object
    public Employee(){
		// Accesses parent class Person
        super();
		// Sets employeeID to "No id yet" as default
        employeeID = "No id yet";
		// Sets salary to 0 as default
        salary = 0;
	}
	
    // Parameterized constructor
    public Employee(String initialName, String initialEmployeeID, double initialSalary)
	{
		super(initialName); // this is calling the one arg Person constructor
		employeeID = initialEmployeeID;
		salary = initialSalary;
	}
	
	// Set method for name, employeID, and salary
    public void set(String newName, String newEmployeeID, double newSalary)
	{
		setName(newName);
		employeeID = newEmployeeID;
		salary = newSalary;
	}
	
	// Set employeeID method
    public void setEmployeeID(String newEmployeeID)
	{
		employeeID = newEmployeeID;
	}
	
    // Set salary method
    public void setSalary(double newSalary)
	{
		salary = newSalary;
	}
	
	// Get employeeID method
    public String getEmployeeID()
	{
		return employeeID;
	}
	
    // Get salary method
    public double getSalary()
	{
		return salary;
	}

	// toString method to print Employee object
    public String toString()
	{
		return "Name: " + getName() + "\nID: " + employeeID + "\nSalary: " + salary;
	}

	// boolean sameEmployee method to compare Employee objects
    public boolean sameEmployee(Employee otherEmployee) {
        return getName().equalsIgnoreCase(otherEmployee.getName()) 
		&& getEmployeeID() == otherEmployee.employeeID 
		&& getSalary() == otherEmployee.getSalary();
    }

}

