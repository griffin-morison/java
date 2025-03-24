public class Student extends Person{
	private int studentNumber;
	
	// Default constructor
    public Student(){
		super();
		//this("None", 111);
		studentNumber = 0;
	}
	
	// Parameterized constructor
    public Student(String initialName, int initialStudentNumber)
	{
		super(initialName); // this is calling the one arg Person constructor
		studentNumber = initialStudentNumber;
	}
	
	// Set method
    public void set(String newName, int newStudentNumber)
	{
		setName(newName);
		studentNumber = newStudentNumber;
	}
	
	// Set StudentNumber method
    public void setStudentNumber(int newStudentNumber)
	{
		studentNumber = newStudentNumber;
	}
	
	// Get StudentNumber method
    public int getStudentNumber()
	{
		return studentNumber;
	}
	
	// Compare equal method
    public boolean equals(Object otherObject)
	{
		if(otherObject == null)
		{
			return false;
		}
		if(this.getClass() != otherObject.getClass())
		{
			return false;
		}
		Student otherStudent = (Student) otherObject;
		return (this.sameName(otherStudent) && this.studentNumber 
				== otherStudent.studentNumber);
 		
	}

	// toString method
    public String toString()
	{
		return "Name: " + getName() + "\nStudent Number: " + studentNumber;
	}

}
