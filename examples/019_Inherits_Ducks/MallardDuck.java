/**
 * Example 019: Inherits Ducks
 * Filename: MallardDuck.java
 * @author Griffin Morison
 *
 * Description: This java file represents the MallardDuck class. This class has 
 * one private variable for myAge. MallaradDuck is a public class that extends 
 * the Duck class, which means it inherits the same variables and methods of 
 * that class. It can be called by the TestDriver. In this file we have a contructor 
 * that take the same input variable as the Duck class. This class also declares 
 * methods to make a copy, quack, fly, and drink.
 */

public class MallardDuck extends Duck{
	// Public int variable for MallardDuck object
    public int myAge;
	// Public constructor method which takes no variables as inputs
    public MallardDuck(){
		//System.out.println("Mallard Duck Default Constructor");
		this( "Foo", 0, 0, 5, (int)(30*Math.random()) );
	}
	// Public constructor method which takes all variables as inputs
    public MallardDuck( String name, int x, int y, int speed, int age){
		//System.out.println("Mallard Duck General Constructor");
		//setName( name );
		//setX ( x );
		//setY( y );
		//setSpeed( speed );
		
        // Super is a reference variable that is used to refer to parent class Duck
        super( name, x, y, speed, age);
		//this("Foo", 0,0, 5); both want to be first
	}
	//Copy Constructor
	public MallardDuck( MallardDuck md){
		this( md.getName(), md.getX(), md.getY(), md.getSpeed(), md.getAge() );
	}
	// MallardDuck method to make a copy object
    public MallardDuck makeCopy(){
		return new MallardDuck( this );
	}
	// Void method for MallardDuck to quack
    public void quack() {
		System.out.println( getName() + " quacks loudly and rudely");
	}
	// Void method for MallardDuck to fly
    public void fly(){
		System.out.println( getName() + " flies quickly upward");
	}
	// Void method for MallardDuck to drink
    public void drink() {
		System.out.println(getName() + " drinks champagne from a bottle");
	}
	// To String method for printing MallardDuck
    public String toString(){
		return super.toString() + " " + myAge;
	}
}