/**
 * Example 019: Inherits Ducks
 * Filename: Duck.java
 * @author Griffin Morison
 *
 * Description: This java file represents the Duck class and contains
 * private and protected variables, which can only be accessed within a class 
 * and its subclasses. Duck is a public class that can be called by the TestDriver. 
 * The public class has four public int variables for myX, myY, mySpeed, and myAge. 
 * The file also has a protected String variable for myName. In this file we also 
 * declare set and get methods for each of the variables and two void functions that 
 * for flying and quaking.
 *
 */

public class Duck {
	// Protected String variables for Duck object
    protected String myName;
	// Private int variables for Duck object
    private int myX;
	private int myY;
	private int mySpeed;
	private int myAge;
	// Public constructor method which takes no variables as inputs
    public Duck(){
		System.out.println( "Duck Default Constructor");
		myName = "Daffy";
		myX = 0;
		myY = 0;
		mySpeed = 1;
		myAge = 1;
	}
	/**
	 * General Duck Constructor
	 * @param name
	 * @param x
	 * @param y
	 * @param speed
	 * @param age
	 */
	// Public constructor method which takes all variables as inputs
     public Duck( String name, int x, int y, int speed, int age){
		System.out.println( "Duck General Constructor");
		myName = name;
		myX = x;
		myY = y;
		mySpeed = speed;
		myAge = age;
	}
	// Set method for Duck name
    public void setName( String name ){
		myName = name;
	}
	// Get method for Duck name
    public String getName() {
		return myName;
	}
	// Set method for Duck x value
    public void setX( int x){
		myX = x;
	}
	// Get method for Duck x value
    public int getX() {
		return myX;
	}
	// Set method for Duck y value
    public void setY( int y){
		myY = y;
	}
	// Get method for Duck y value
    public int getY() {
		return myY;
	}
	// Set method for Duck speed value
    public void setSpeed( int speed){
		mySpeed = speed;
	}
	// Get method for Duck speed value
    public int getSpeed(){
		return mySpeed;
	}
	// Set method for Duck age value
    public void setAge(int age){
		myAge = age;
	}
	// Get method for Duck age value
    public int getAge(){
		return myAge;
	}
	// Void method for Duck to fly
    public void fly() {
		System.out.println( myName + " flies");
	}
	// Void method for Duck to quack
    public void quack() {
		System.out.println( myName + " quacks");
	}
	// To String method for printing Duck
    public String toString(){
		return myName + " " + myX + " " + myY + " " + mySpeed + " " + myAge;
	}
	// Duck method to make a copy object
    public Duck makeCopy() {
		// TODO Auto-generated method stub
		return null;
	}
}