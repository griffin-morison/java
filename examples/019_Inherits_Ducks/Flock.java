/**
 * Example 019: Inherits Ducks
 * Filename: Flock.java
 * @author Griffin Morison
 *
 * Description: This java file represents the Flock class and imports the java
 * utility ArrayList. This class has one private variables, which is an ArrayList
 * of Duck objects. Flock is a public class that can be called by the TestDriver.
 * In this file we have a contructor that take an int input variable for numberOfDucks
 * and creates either Pintail or Mallard ducks and adds them to the ArrayList.
 * This class also declares methods to return the oldest duck, add a duck or quack.
 */

import java.util.ArrayList;

public class Flock {
	// Private ArrayList of Duck objects
    private ArrayList<Duck> myDucks;
	// Public default constructor method which takes no variables as inputs
    public Flock() {
		myDucks = new ArrayList<Duck>();
	}
	// Public constructor method which takes int variable as input
    public Flock( int numberOfDucks){
		myDucks = new ArrayList<Duck>();
		// For loop to iterate the numberOfDucks in Flock
        for( int i = 0; i < numberOfDucks; i++){
            // If random number is greater than 0.5 create Pintail Duck
            if( Math.random() > 0.5 ){
			//Create a Pintail Duck and add it to the Flock
			PintailDuck foo = new PintailDuck( "PintailDuck", 
					(int)(100*Math.random()), 
					(int)(100*Math.random()),
					(int)(10*Math.random()),
					(int)(30*Math.random()));
			myDucks.add( foo );
        }
        // Else condition
        else{
			// Create a Mallard Duck and add it to the Flock
			MallardDuck foo = new MallardDuck( "MallardDuck",
					(int)(100*Math.random()), 
					(int)(100*Math.random()),
					(int)(10*Math.random()),
					(int)(100*Math.random()));
			myDucks.add( foo );
		}
		}
	}
	// Duck method to find the oldest duck
    public Duck oldestDuck(){
		// Create Duck object and set value to first Duck
        Duck theOldest = myDucks.get( 0 );
		// For loop to iterate through Duck objects
        for ( Duck currentDuck : myDucks) {
			// If current duck age is greater then duck object
            if( currentDuck.getAge() > theOldest.getAge() ){
				// Set duck object to current duck
                theOldest = currentDuck;
			}
		}
		// Return oldest duck
        return theOldest.makeCopy();

	}
	// Void method to add a Duck to Flock
    public void add( Duck aDuck ){
		myDucks.add( aDuck );
	}
	// Void method to make duck objects in Flock quack
    public void quack(){
		for ( Duck theDuck : myDucks ) {
			theDuck.quack();
		}
	}
	// To String method for printing Flock
    public String toString(){
		return myDucks.toString();
	}
}