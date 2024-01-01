public class QuikSort {

    // Method to find the pivot index for partitioning
    public static int findPivotIndex(int[] arr, int start, int end) {

        // Choosing the pivot element as the first element of the partition
        int pivotElement = arr[start];
        int smallerElement = 0;

        // Counting elements smaller than the pivot element in the partition
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < pivotElement) {
                smallerElement++;
            }
        }
        // Calculating the pivot index after partitioning
        int pivotIndex = start + smallerElement;

        // Swapping the pivot element with its correct position in the array
        int temp = arr[pivotIndex];
        arr[pivotIndex] = pivotElement;
        arr[start] = temp;

        // Partitioning the array around the pivot element
        while (start < end) {

            if (arr[start] < pivotElement) {
                start++;

            } else if (arr[end] >= pivotElement) {
                end--;

            } else {
                // Swapping elements to ensure elements smaller than pivot are on the left
                // and elements larger or equal to pivot are on the right
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                end--;
                start++;
            }
        }

        // Returning the index of the pivot element
        return pivotIndex;
    }

    // Method to perform QuickSort recursively
    public static void quickSort(int[] arr, int start, int end) {

        // Base case: If partition size is 1 or less, return
        if (start >= end) {
            return;
        }

        // Finding pivot index
        int pivotIndex = findPivotIndex(arr, start, end);

        // Recursively sort the left and right partitions of the array
        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }

    // Method to print the elements of an array
    public static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Main method to demonstrate QuickSort
    public static void main(String[] args) {
        // Input array
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        // Perform QuickSort on the input array
        quickSort(arr, 0, arr.length - 1);

        // Print the sorted array
        print(arr);
    }
}
