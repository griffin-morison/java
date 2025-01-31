/*
* Examples 006: Dice Roller
* Filename: RollingDice.java
* Description: This java file will demonstrate the probabilities of rolling 
* two dice. It will specifically examine the probability of rolling a seven.
*/

public class RollingDice {
    public static void main(String[] args) {
        // Integer variables for the 11 possible outcomes from rolling two dice
        int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		int sevens = 0;
		int eights = 0;
		int nines = 0;
		int tens = 0;
		int elevens = 0;
		int twelves = 0;
		
		// For loop which iterates 1000 times
		for(int i = 0; i <1000; i++) {
		    // Integer variables for dice using a typecast
			int firstDie = (int) (6 * Math.random() + 1);
			int secondDie = (int) (6 * Math.random() + 1);
            // Switch case statements for each outcome
			switch ( firstDie + secondDie ) {
                case 2: twos = twos + 1;
                break;
			    case 3: threes = threes + 1;
			    break;
			    case 4: fours = fours + 1;
			    break;
			    case 5: fives = fives + 1;
			    break;
			    case 6: sixes = sixes + 1; 
			    break;
			    case 7: sevens = sevens + 1; 
			    break;
			    case 8: eights = eights + 1;
			    break;
			    case 9: nines = nines + 1;
			    break;
			    case 10: tens = tens + 1;
			    break;
			    case 11: elevens = elevens + 1;
			    break;
			    case 12: twelves = twelves + 1;
			    break;
			    // Error case
                default: System.out.println( "Error" );
			}
        }
        // Prints the results of each outcome
        System.out.println("Twos: " + twos);
        System.out.println("Threes: " + threes);
        System.out.println("Fours: " + fours);
        System.out.println("Fives: " + fives);
        System.out.println("Sixes: " + sixes);
        System.out.println("Sevens: " + sevens);
        System.out.println("Eights: " + eights);
        System.out.println("Nines: " + nines);
        System.out.println("Tens: " + tens);
        System.out.println("Elevens: " + elevens);
        System.out.println("Twelves: " + twelves);

        // Prints the number of Sevens which occurred
        // as a percentage of the 1000 rolls with
        // two places after the decimal point
        // (i.e. Seven occurred: 34.56% of the rolls).
        double percent = (((double) sevens / 1000.0) * 100);
        System.out.printf("This is my percent %10.2f\n", percent);
    }
}
