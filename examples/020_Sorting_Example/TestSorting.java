
public class TestSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create int array foo of size 6
        int[] foo = new int[6];
		// Assign values at each index 
        foo[0] = 10;
		foo[1] = 5;
		foo[2] = 6;
		foo[3] = 1;
		foo[4] = 12; 
		foo[5] = 4;
		// Print foo array unsorted
        TestSorting.print( foo );
		// Sort foo array
        TestSorting.sort( foo );
		// Print foo array sorted
        TestSorting.print( foo );
    }
	// Void function to print int array
    public static void print(int[] anArray){
		// For loop to iterate array
        for( int i =0; i < anArray.length; i++){
			// Print index at i
            System.out.print(anArray[i] + " ");
        }
		System.out.println();
    }
	// Void function to sort int array
    public static void sort(int[] someArray){
		// For loop to iterate array
        for(int i = 0; i < someArray.length; i++) {
			// Find smallest value and store as index
            int index = TestSorting.findSmallest(someArray, i);
			// Swap smallest index and i 
            TestSorting.swap(someArray, index, i);
        }
	}
	// Int function to find smallest value in int array
    public static int findSmallest(int[] anArray, int startIndex){
		// Create variable to store smallestIndex as startIndex
        int smallestIndex = startIndex;
		// For loop to iterare array
        for(int i = startIndex; i < anArray.length; i++){
		    // If input anArray index i is less than anArray index smallestIndex
            if(anArray[i] < anArray[smallestIndex]){
			    // Store value of i at smallestIndex
                smallestIndex = i;
            }
	    }
        return smallestIndex;
    }
	// Void function to swap first and second index of int array
    public static void swap(int[] theArray, int first, int second){
		// Create int temp to store value of first index in theArray
        int temp = theArray[first];
		// Set value of first index in theArray to value of second index in theArray
        theArray[first] = theArray[second];
		// Set value of second index in theArray to temp value
        theArray[second] = temp;
	}
}


