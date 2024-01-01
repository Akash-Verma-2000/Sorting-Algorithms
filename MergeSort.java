public class MergeSort {

    // Function to merge two sorted arrays into one sorted array
    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0;
        int j = 0;
        int k = 0;

        // Compare elements from both arrays and merge into the third array
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }

        // Copy remaining elements from array 'a' into the third array
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements from array 'b' into the third array
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
    }

    // Recursive function to perform merge sort
    public static void mergeSort(int[] arr) {
        // Base case: if the array has only one element, return
        if (arr.length == 1) {
            return;
        }

        // Split the input array into two halves
        int[] a = new int[arr.length / 2];
        int[] b = new int[arr.length - a.length];

        // Copy elements from the input array to the two halves
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[i];
        }

        int k = 0;
        // Copy remaining elements to the second half
        for (int i = a.length; i < arr.length; i++) {
            b[k] = arr[i];
            k++;
        }

        // Recursively sort the two halves
        mergeSort(a);
        mergeSort(b);

        // Merge the sorted halves into the original array
        merge(a, b, arr);
    }

    // Function to print the elements of an array
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        // Perform merge sort on the input array
        mergeSort(arr);

        // Print the sorted array
        print(arr);
    }
}
