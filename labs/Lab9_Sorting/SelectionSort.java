// Selection Sort repeatedly steps through an array, finding the minimum value,
// and swaping it with the left most element
// Time complexity: O(n^2) slow for large datasets, best for small list
// for(j = 0; j < n - 1; j++)
// int iMin = j;
// for(i = j + 1; i < n; i++)
// if(a[i] < a[iMin])
// iMin = i;
// if(iMin != j)
// swap(a[j], a[iMin])

public class SelectionSort {
    /**
     * Precondition: numberUsed <= a.length;
     * The first numberUsed indexed variables have values.
     * Action: Sorts a so that a[0] <= a[1] <= ... <= a[numberUsed - 1].
     */
    public static void sort(double[] a, int numberUsed) {
        // Variables to store index and next smallest index
        int index, indexOfNextSmallest;
        // For loop to iterate through array
        for (index = 0; index < numberUsed - 1; index++) {
            // Place the correct value in a[index]:
            // Set next smallest as index of smallest
            indexOfNextSmallest = indexOfSmallest(index, a, numberUsed);
            // Interchange index and next smallest
            interchange(index, indexOfNextSmallest, a);
            // a[0] <= a[1] <=...<= a[index] and these are the smallest
            // of the original array elements. The remaining positions
            // contain the rest of the original array elements.
        }
    }

    /**
     * Returns the index of the smallest value among
     * a[startIndex], a[startIndex+1], ... a[numberUsed - 1]
     */
    private static int indexOfSmallest(int startIndex, double[] a, int numberUsed) {
        // Store min as array start index
        double min = a[startIndex];
        // 
        int indexOfMin = startIndex;
        // Int variable for index
        int index;
        // For loop to iterate array
        for (index = startIndex + 1; index < numberUsed; index++){
            // If index is less than min value
            if (a[index] < min) {
                // Set min value to index
                min = a[index];
                // Set index of min value to index
                indexOfMin = index;
                // min is smallest of a[startIndex] through a[index]
            }
        }
        // Return index of min
        return indexOfMin;
    }

    /**
     * Precondition: i and j are legal indices for the array a.
     * Postcondition: Values of a[i] and a[j] have been interchanged.
     */
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
}
