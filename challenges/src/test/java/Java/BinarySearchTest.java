package Java;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    int inputArray[] = new int[]{1,3,6,7,9,15,17,25,29,35,59,86,99,100};
   
    @Test
    public void test_return_index_of_array_equal_to_search_key() {
        assertEquals(7, BinarySearch.binarySearch(inputArray, 25));
    }

    @Test
    public void test_return_index_of_array_search_key_at_first_element() {
        assertEquals(0, BinarySearch.binarySearch(inputArray, 1));
    }

    @Test
    public void test_return_index_of_array_search_key_at_end() {
        assertEquals(13, BinarySearch.binarySearch(inputArray, 100));
    }

    @Test
    public void test_given_key_not_in_array() {
        assertEquals(-1, BinarySearch.binarySearch(inputArray, 55));
    }
}
