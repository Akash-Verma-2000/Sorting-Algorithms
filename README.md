# Sorting Algorithm

## Bubble Sort:

Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.

### Steps:

- Traverse from left and compare adjacent elements and the higher one is placed at right side.
- In this way, the largest element is moved to the rightmost end at first.
- This process is then continued to find the second largest and place it and so on until the data is sorted.


![Step 1](/screenshots/Step-1-bubble-sort.png "Step 1")
![Step 2](/screenshots/Step-2-bubble-sort.png "Step 2")
![Step 3](/screenshots/Step-3-bubble-sort.png "Step 3")

### Complexity Analysis of Bubble Sort:

- Time Complexity: O(N2)
- Auxiliary Space: O(1)

### Advantages of Bubble Sort:

- Bubble sort is easy to understand and implement.
- It does not require any additional memory space.
- It is a stable sorting algorithm, meaning that elements with the same key value maintain their relative order in the sorted output.

### Disadvantages of Bubble Sort:

- Bubble sort has a time complexity of O(N2) which makes it very slow for large data sets.

- Bubble sort is a comparison-based sorting algorithm, which means that it requires a comparison operator to determine the relative order of elements in the input data set. It can limit the efficiency of the algorithm in certain cases.
