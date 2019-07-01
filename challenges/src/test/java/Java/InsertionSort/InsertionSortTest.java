package Java.InsertionSort;

import static org.junit.Assert.*;
import org.junit.Test;

public class InsertionSortTest {

    @Test (expected = IllegalArgumentException.class)
    public void testEmptyArr(){
        InsertionSort testing = new InsertionSort();
        int [] arr = new int[]{};
        testing.insertionSort(arr);
    }

    @Test
    public void testWithPositiveValues(){
        InsertionSort testing = new InsertionSort();
        int [] arr = new int[]{21, 12, 18, 15, 6, 1};
        int [] result = new int[]{1, 6, 12, 15, 18, 21};
        testing.insertionSort(arr);
        assertArrayEquals(result, arr);
    }

    @Test
    public void testWithNegativeValues(){
        InsertionSort testing = new InsertionSort();
        int [] arr = new int[]{-21, 12, -18, 15, -6, 1};
        int [] result = new int[]{-21, -18, -6, 1, 12, 15};
        testing.insertionSort(arr);
        assertArrayEquals(result, arr);
    }



}