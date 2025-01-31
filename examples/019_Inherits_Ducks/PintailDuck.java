/**
 * Example 019: Inherits Ducks
 * Filename: PintailDuck.java
 * @author Griffin Morison
 *
 * Description: This java file represents the PintailDuck class. PintailDuck 
 * is a public class that extends the Duck class, which means it inherits the 
 * same variables and methods of that class. It can be called by the TestDriver. 
 * In this file we have a contructor that take the same input variable as the 
 * Duck class. This class also declares methods to make a copy, quack, and fly.
 */

public class PintailDuck extends Duck {
	// Public constructor method which takes no variables as inputs
    public PintailDuck(){
		this( "PintailDuck", 0, 0, 1, (int)(20*Math.random()));
	}
	// Public constructor method which takes all variables as inputs
    public PintailDuck( String name, int x, int y, int speed, int age){
		super( name, x, y, speed, age);
	}
	// Public constructor method which takes a PintailDuck object as input
    public PintailDuck( PintailDuck pd){
		this( pd.getName(), pd.getX(), pd.getY(), pd.getSpeed(), pd.getAge() );
	}
	// PintailDuck method to make a copy object
    public PintailDuck makeCopy() {
		return new PintailDuck( this );
	}
	// Void method for PintailDuck to quack
    public void quack(){
		System.out.println( this.getName() + " quacks softly");
	}
	// Void method for PintailDuck to fly
    public void fly(){
		System.out.println( this.getName() + " flies toward the sunset");
	}
}