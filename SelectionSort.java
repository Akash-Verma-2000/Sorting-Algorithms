public class SelectionSort {

    // Method to perform the selection sort algorithm on an integer array
    public static void selectionSort(int[] arr) {

        int n = arr.length;

        // Outer loop for iterating through the array elements
        for (int i = 0; i < n; i++) {

            // Set the current element as the minimum
            int min = arr[i];

            // Initialize the index of the minimum element
            int minIndex = i;

            // Inner loop to find the minimum element in the unsorted portion of the array
            for (int j = i; j < n; j++) {

                // Update the minimum element and its index if a smaller element is found
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the current element (at position i)
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }

    // Method to print the elements of an array
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Sample arrays to be sorted using bubble sort
        int[] arr = { 64, 25, 12, 22, 11 };

        // Sorting the arrays using the bubbleSort method
        selectionSort(arr);

        // Printing the sorted arrays
        print(arr);
    }
}
