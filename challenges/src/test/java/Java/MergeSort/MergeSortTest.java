package Java.MergeSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test (expected = IllegalArgumentException.class)
    public void testEmptyArr(){
        MergeSort testing = new MergeSort();
        int [] arr = new int[]{};
        testing.mergeSort(arr);
    }

    @Test
    public void testMergeSort(){
        int[] testing = new int[]{5,7,3,2,9,4};
        int[] result = new int[]{2,3,4,5,7,9};
        assertArrayEquals(MergeSort.mergeSort(testing), result);
    }

    @Test
    public void testMergeAlreadySorted(){
        int[] testing = new int[]{4,5,6,7,8,9};
        assertArrayEquals(MergeSort.mergeSort(testing), testing);
    }

    @Test
    public void testMergeSortNegs(){
        int[] testing = new int[]{-12,-20,10,20,4};
        int[] result = new int[]{-20,-12,4,10,20};
        assertArrayEquals(MergeSort.mergeSort(testing), result);
    }

}