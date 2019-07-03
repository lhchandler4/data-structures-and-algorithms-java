package Java.QuickSort;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArr(){
        QuickSort testing = new QuickSort();
        int [] arr = new int[]{};
        testing.quickSort(arr, 0, 0);
    }

    @Test
    public void testQuickSort(){
        int[] testing = new int[]{5,7,3,2,9,4};
        int[] result = new int[]{2,3,4,5,7,9};
        QuickSort.quickSort(testing, 0, 5);
        assertArrayEquals(result, testing);
    }

    @Test
    public void testQuickAlreadySorted(){
        int[] testing = new int[]{4,5,6,7,8,9};
        QuickSort.quickSort(testing, 0, 5);
        assertArrayEquals(testing, testing);
    }

   @Test
    public void testMergeSortNegs(){
       int[] testing = new int[]{-12,-20,10,20,4};
       int[] result = new int[]{-20,-12,4,10,20};
       QuickSort.quickSort(testing, 0, 4);
       assertArrayEquals(result, testing);
   }

}