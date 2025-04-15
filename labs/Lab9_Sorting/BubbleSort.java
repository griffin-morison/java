// Bubble Sort repeatedly steps through an array, comparing adjecent elements, 
// and swaps larger values to the end.
// Time complexity: O(n^2), slow for large datasets, best for small list
// for i from 1 to N
// for j from 0 to N - 1
// if a[j] > a[j+1]
// swap(a[j], a[j+1])

public class BubbleSort {

    // Bubble Sort method
    public static void sort(double[] a, int numberUsed) {
        // Int variable to store index
        int index;
        // While array is not sorted
        while (isSorted(a, numberUsed) == false) {
            // For loop to iterate array
            for (index = 0; index < numberUsed - 1; index++) {
                // If index is greater than index + 1
                if (a[index] > a[index + 1]) {
                    // Interchange values
                    interchange(index, index + 1, a);
                }
            }
        }
    }

    // Method to interchange values
    private static void interchange(int i, int j, double[] a) {
        // Double variable temp
        double temp;
        // Set temp equal to index
        temp = a[i];
        // Set index equal to index + 1
        a[i] = a[j];
        // Set index + 1 equal to index
        a[j] = temp;
        // original value of a[i]
    }

    // Boolean method to check if sorted
    private static boolean isSorted(double[] a, int numberUsed) {
        // see if the array is sorted
        // Int variable to store index
        int index;
        // For loop to iterate array
        for (index = 0; index < numberUsed - 1; index++) {
            // If index is greater than index + 1
            if (a[index] > a[index + 1]) {
                // Return false
                return false;
            }
        }
        // Else return true
        return true;
    }
}
