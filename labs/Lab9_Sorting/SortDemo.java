public class SortDemo {
    public static void main(String[] args) {
        // Creates list of doubles
        double[] b = { 7.7, 5.5, 11, 3, 16, 4.4, 20, 14, 13, 42 };

        // Prints contents before sorting
        System.out.println("Array contents before sorting:");
        int i;
        for (i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println();

        // Selection Sort
        SelectionSort.sort(b, b.length);
        
        // Bubble Sort
        // BubbleSort.sort(b, b.length);

        // Prints contents after sorting
        System.out.println("Sorted array values:");
        for (i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println();
    }
}
