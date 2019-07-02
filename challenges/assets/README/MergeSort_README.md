# Merge Sort
- Given an array of the type of integer, Complete a working merge sort implementation. Take in an
array of integers and divide it into n sub arrays. Then merge those sub arrays back into 1 sorted array.
(sort the left half, sort the right half, and then merge the 2 halfs)  

## Challenge
- First we need to check that the array is not an empty array.
- Next we need to divide the array into two halves and sort the numbers. 
- The second step is done recursively 
- Finally we will check the sub arrays and merge them so that they are sorted from minimum to maximum.
- Return the sorted array

## Approach & Efficiency
- Time of O(nlogn)
- Space of O(n)
- Throw an illegal argument exception if the array is empty
- If the length of the array is greater than 1 we will split it at the midpoint
- Then we will call the mergeSort method recursively on the two halves.
- Finally we will call the merge method on the two halves.
- In the merge method, we will have three variable to keep track of indexes. 
- By comparing the sub arrays at these indexes we will add the numbers in a sorted manner back into the 
final array which we will return.

## API
- ```mergeSort(int[] arr)```
- ```mergeArr(int[] bArr, int[] cArr, int[] arr)```

## Acknowledgements/Resources
- Techie Delight
  - https://www.techiedelight.com/merge-sort/
- Interview Bit
  - https://www.interviewbit.com/tutorial/merge-sort-algorithm/
- Robert Bronson for helping me understand it a little better high level

## Code
[Merge Sort Code](../../src/main/java/Java/MergeSort/MergeSort.java)

## Tests
[Merge Sort Tests](../../src/test/java/Java/MergeSort/MergeSortTest.java)

## Whiteboard Picture
![](../img/mergeSort.jpeg)

## Sample Lecture
- [Merge Sort Sample Lecture](./InsertionSortSampleLecture.md)