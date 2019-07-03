# Quick Sort Sample Lecture
- 

## Goals:
- Learn what a quick sort algorithm is and how to code and implement one.

## Lecture ToDo List:
- Sorting is a way to organize data based on the parameters given and desired. There are many different ways of sorting.
- The sort that will be taught is for an array of integers and will sort it from minimum to maximum value.
- Go over the problem domain, the visual, the Big O.
- Pseudo Code it out.
- Write the real code, and then test it.
- Think of the edge cases for insertion sort.

## Whiteboard
![](../img/QuickSort.jpeg)

## Algo
- Time of O(nlogn)
- Space of O(log(n))
- Throw an illegal argument exception if the array is empty.
- First we need to check that the array is not an empty array.
- Then pick a pivot and walk through the array from left to right and right to left and swap the elements
if they are out of order. 
- Everything to the left of the pivot is smaller than the pivot and everything to the right of the pivot is
larger than the pivot. 
- Then we do quickSort on the two halves
- The quickSort method step is done recursively.
- Return the sorted array

## PseudoCode (from assignment on Canvas)
```  ALGORITHM QuickSort(arr, left, right)
         if left < right
             // Partition the array by setting the position of the pivot value 
             DEFINE position <-- Partition(arr, left, right)
             // Sort the left
             QuickSort(arr, left, position - 1)
             // Sort the right
             QuickSort(arr, position + 1, right)
     
     ALGORITHM Partition(arr, left, right)
         // set a pivot value as a point of reference
         DEFINE pivot <-- arr[right]
         // create a variable to track the largest index of numbers lower than the defined pivot
         DEFINE low <-- left - 1
         for i <- left to right do
             if arr[i] <= pivot
                 low++
                 Swap(arr, i, low)
     
          // place the value of the pivot location in the middle.
          // all numbers smaller than the pivot are on the left, larger on the right. 
          Swap(arr, right, low + 1)
          return low + 1
     
     ALGORITHM Swap(arr, i, low)
         DEFINE temp;
         temp <-- arr[i]
         arr[i] <-- arr[low]
         arr[low] <-- temp
   ```

## Code
[Merge Sort Code](../../src/main/java/Java/MergeSort/MergeSort.java)

## Tests
[Insertion Sort Tests](../../src/test/java/Java/MergeSort/MergeSortTest.java)

## References
- Video References:
  - [Hacker Rank](https://www.youtube.com/watch?v=SLauY6PpjW4)
  
- Reading References:
  - [Geeks for Geeks](https://www.geeksforgeeks.org/java-program-for-quicksort/)
  - [Program Creek](https://www.programcreek.com/2012/11/quicksort-array-in-java/)
