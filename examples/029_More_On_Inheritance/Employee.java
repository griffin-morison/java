public class Employee extends Person{
	private String employeeID;
	private double salary;
	
	// Default constructor
    public Employee(){
		super();
		employeeID = "No id yet";
		salary = 0;
	}
	
    // Parameterized constructor
    public Employee(String initialName, String initialEmployeeID, double initialSalary)
	{
		super(initialName); // this is calling the one arg Person constructor
		employeeID = initialEmployeeID;
		salary = initialSalary;
	}
	
	// Set method
    public void set(String newName, String newEmployeeID, double newSalary)
	{
		setName(newName);
		employeeID = newEmployeeID;
		salary = newSalary;
	}
	
	// Set EmployeeID method
    public void setEmployeeID(String newEmployeeID)
	{
		employeeID = newEmployeeID;
	}
	
    // Set Salary method
    public void setSalary(double newSalary)
	{
		salary = newSalary;
	}
	
	// Get EmployeeID method
    public String getEmployeeID()
	{
		return employeeID;
	}
	
    // Get Salary method
    public double getSalary()
	{
		return salary;
	}

	// toString method
    public String toString()
	{
		return "Name: " + getName() + "\nID: " + employeeID + "\nSalary: " + salary;
	}

}

