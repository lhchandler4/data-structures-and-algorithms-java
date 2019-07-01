# Insertion Sort
- Given an array of the type of integer, sort the array from minimum to maximum.  

## Challenge
- First we need to check that the array is not an empty array.
- Next we need to sort the array from minimum to maximum integer value

## Approach & Efficiency
- Time of O(n^2)
- Space of O(1)
- Throw an illegal argument exception if the array is empty
- A for loop to the length of the array where the i is 1.
- Within the for loop there will be another variable which is j. One will keep track of the current position and one will advance
- In the while loop, we will check that the j variable is greater than 0 and that the temporary array is less than the input array at j 

## API
- ```insertionSort(int[] arr)```

## Acknowledgements/Resources
- Hacker Earth
  - https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/tutorial/
- Interview Bit
  - https://www.interviewbit.com/tutorial/insertion-sort-algorithm/
 

## Code
[Insertion Sort Code](../../src/main/java/Java/InsertionSort/InsertionSort.java)

## Tests
[Insertion Sort Tests](../../src/test/java/Java/InsertionSort/InsertionSortTest.java)

## Whiteboard Picture
![](../img/InsertionSort.jpeg)

## Sample Lecture
- [Insertion Sort Sample Lecture](./InsertionSortSampleLecture.md)