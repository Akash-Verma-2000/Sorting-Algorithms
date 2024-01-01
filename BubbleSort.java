public class BubbleSort {

    // Method to perform the bubble sort algorithm on an integer array
    public static void bubbleSort(int[] arr) {

        // Outer loop for the number of passes through the array
        for (int i = 0; i < arr.length - 1; i++) {

            // Flag to check if any swap occurred in the inner loop
            boolean isSwapped = false;

            // Inner loop to compare adjacent elements and perform swaps if needed
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // If the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // Set the flag to true indicating a swap occurred
                    isSwapped = true;
                }
            }

            // If no swap occurred in the inner loop, the array is already sorted, and the
            // process can stop
            if (isSwapped == false) {
                return;
            }
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
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 5, 4, 3, 2, 1 };

        // Sorting the arrays using the bubbleSort method
        bubbleSort(arr1);
        bubbleSort(arr2);

        // Printing the sorted arrays
        print(arr1);
        print(arr2);

    }
}