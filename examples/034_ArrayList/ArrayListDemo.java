import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Creates an ArrayList
        ArrayList<Integer> numList = new ArrayList<Integer>(); 
		// Add to ArrayList
        numList.add(new Integer(53));
		numList.add(4);
		numList.add(17);
		// Print ArrayList
        System.out.println(numList);
		// Add at index a value
        numList.add(1, 5);
		// Print ArrayList
        System.out.println(numList);
		System.out.println(numList.size()); // size not same as capacity
		
		int sum = 0;
		// For loop to iterate ArrayList
        for(int i = 0; i < numList.size(); i++)
		{
			// Increment sum
            sum += numList.get(i);
		}
        // Prints sum 
        System.out.println(sum);
		
		// For loop to iterate ArrayList and increment values by 1
        for(int i = 0; i < numList.size(); i++)
		{
			// Increment value at index i in ArrayList by 1
			numList.set(i, numList.get(i) + 1);
		}
		// Print ArrayList
        System.out.println(numList);
		// Remove 54 from ArrayList
        numList.remove(new Integer(54));
		// Print ArrayList
        System.out.println(numList);
	}

}
