
public class TestSortingSong {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        // Create Song array of size 6
        Song[] foo = new Song[6];
        foo[0] = new Song("i", "Kendrick Lamar", 10);
        foo[1] = new Song("Rather Be", "Clean Bandit", 5);
        foo[2] = new Song("Happy", "Pharrell Williams", 6);
        foo[3] = new Song("Let It Go", "Demi Lovato", 1);
        foo[4] = new Song("Stay With Me", "Sam Smith", 12);
        foo[5] = new Song("Ain't It Fun", "Paramore", 4);
        // Print Song array unsorted
        TestSortingSong.print(foo);
        // Sort Song array
        TestSortingSong.sort(foo);
        // Print Song array sorted
        TestSortingSong.print(foo);
    }
    // Void function to print Song array 
    public static void print(Song[] anArray) {
        // For loop to iterate Song array size
        for (int i = 0; i < anArray.length; i++) {
            // Print Song object at index i
            System.out.print(anArray[i].toSting() + " ");
        }
        System.out.println();
    }
    // Void function to sort Song array
    public static void sort(Song[] someArray) {
        // For loop to iterate Song array size
        for (int i = 0; i < someArray.length; i++) {
            // Find smallest value and store as index
            int index = TestSortingSong.findSmallest(someArray, i);
            // Swap smallest index and i 
            TestSortingSong.swap(someArray, index, i);
        }
    }
    // Int function to find smallest value in Song array
    public static int findSmallest(Song[] anArray, int startIndex) {
        // Create variable to store smallestIndex as startIndex
        int smallestIndex = startIndex;
        // For loop to iterare array
        for (int i = startIndex; i < anArray.length; i++) {
            // If input anArray index i is less than anArray index smallestIndex
            if (anArray[i].compareTo(anArray[smallestIndex])) {
                // Store value of i at smallestIndex
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    // Void function to swap first and second index of Song array
    public static void swap(Song[] theArray, int first, int second) {
        // Create Song temp to store value of first index in theArray
        Song temp = theArray[first];
        // Set value of first index in theArray to value of second index in theArray
        theArray[first] = theArray[second];
        // Set value of second index in theArray to temp value
        theArray[second] = temp;
    }

}
