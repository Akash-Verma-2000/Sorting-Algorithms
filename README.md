# Sorting Algorithm

## **`Bubble Sort`**

Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.

### Steps:

- Traverse from left and compare adjacent elements and the higher one is placed at right side.
- In this way, the largest element is moved to the rightmost end at first.
- This process is then continued to find the second largest and place it and so on until the data is sorted.

### Complexity Analysis of Bubble Sort:

- Time Complexity: **O(N2)**
- Auxiliary Space: **O(1)**

### Advantages of Bubble Sort:

- Bubble sort is easy to understand and implement.
- It does not require any additional memory space.
- It is a stable sorting algorithm, meaning that elements with the same key value maintain their relative order in the sorted output.

### Disadvantages of Bubble Sort:

- Bubble sort has a time complexity of O(N2) which makes it very slow for large data sets.
- Bubble sort is a comparison-based sorting algorithm, which means that it requires a comparison operator to determine the relative order of elements in the input data set. It can limit the efficiency of the algorithm in certain cases.

## **`Selection Sort`**

The algorithm repeatedly selects the smallest (or largest) element from the unsorted portion of the list and swaps it with the first element of the unsorted part. This process is repeated for the remaining unsorted portion until the entire list is sorted.

### Complexity Analysis of Bubble Sort:

- Time Complexity: **O(N2)**
- Auxiliary Space: **O(1)**

### Advantages of Selection Sort Algorithm:

- Simple and easy to understand.
- Works well with small datasets.

### Disadvantages of the Selection Sort Algorithm

- Selection sort has a time complexity of O(n^2) in the worst and average case.
- Does not work well on large datasets.

## **`Merge Sort`**

Merge sort is defined as a sorting algorithm that works by dividing an array into smaller subarrays, sorting each subarray, and then merging the sorted subarrays back together to form the final sorted array.

In simple terms, we can say that the process of merge sort is to divide the array into two halves, sort each half, and then merge the sorted halves back together. This process is repeated until the entire array is sorted.

### How does Merge Sort work?

Merge sort is a recursive algorithm that continuously splits the array in half until it cannot be further divided i.e., the array has only one element left (an array with one element is always sorted). Then the sorted subarrays are merged into one sorted array.

### Complexity Analysis of Merge Sort

- Time Complexity: **O(N log(N))**

- Auxiliary Space: **O(N)**

### Advantages of Merge Sort:

- **Stability:** Merge sort is a stable sorting algorithm, which means it maintains the relative order of equal elements in the input array.

- **Guaranteed worst-case performance:**
  Merge sort has a worst-case time complexity of O(N logN), which means it performs well even on large datasets.

- **Parallelizable:**
  Merge sort is a naturally parallelizable algorithm, which means it can be easily parallelized to take advantage of multiple processors or threads.

### Drawbacks of Merge Sort:

- **Space complexity:**
  Merge sort requires additional memory to store the merged sub-arrays during the sorting process.

- **Not in-place:**
  Merge sort is not an in-place sorting algorithm, which means it requires additional memory to store the sorted data. This can be a disadvantage in applications where memory usage is a concern.

- **Not always optimal for small datasets:** For small datasets, Merge sort has a higher time complexity than some other sorting algorithms, such as insertion sort. This can result in slower performance for very small datasets.

## **`Quick Sort`**

The key process in quickSort is a partition(). The target of partitions is to place the pivot (any element can be chosen to be a pivot) at its correct position in the sorted array and put all smaller elements to the left of the pivot, and all greater elements to the right of the pivot.

Partition is done recursively on each side of the pivot after the pivot is placed in its correct position and this finally sorts the array.

### Time Complexity:

- Best Case: **Ω (N log (N))**

The best-case scenario for quicksort occur when the pivot chosen at the each step divides the array into roughly equal halves.
In this case, the algorithm will make balanced partitions, leading to efficient Sorting.

- Average Case: **θ ( N log (N))**

Quicksort’s average-case performance is usually very good in practice, making it one of the fastest sorting Algorithm.

- Worst Case: **O(N2)**

The worst-case Scenario for Quicksort occur when the pivot at each step consistently results in highly unbalanced partitions. When the array is already sorted and the pivot is always chosen as the smallest or largest element. To mitigate the worst-case Scenario, various techniques are used such as choosing a good pivot (e.g., median of three) and using Randomized algorithm (Randomized Quicksort ) to shuffle the element before sorting.

- Auxiliary Space: **O(1)**

if we don’t consider the recursive stack space. If we consider the recursive stack space then, in the worst case quicksort could make **O(N)**.

### Advantages of Quick Sort:

- It is a divide-and-conquer algorithm that makes it easier to solve problems.
- It is efficient on large data sets.
- It has a low overhead, as it only requires a small amount of memory to function.

### Disadvantages of Quick Sort:

- It has a worst-case time complexity of O(N2), which occurs when the pivot is chosen poorly.
- It is not a good choice for small data sets.
- It is not a stable sort, meaning that if two elements have the same key, their relative order will not be preserved in the sorted output in case of quick sort, because here we are swapping elements according to the pivot’s position (without considering their original positions).

## Contact me

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/akash-verma-09aug2000/) [![LeetCode](https://img.shields.io/badge/-LeetCode-FFA116?style=for-the-badge&logo=LeetCode&logoColor=black)](https://leetcode.com/Akash_Verma2000/) [![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:akash.verma217112@gmail.com)
[![Naukari](https://img.shields.io/badge/Naukri.com-0A66C2?style=for-the-badge&logo=Naukri.com&logoColor=white)](https://www.naukri.com/mnjuser/profile)
