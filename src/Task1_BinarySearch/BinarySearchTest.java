package Task1_BinarySearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    @org.junit.Test
    @Test
    public void testBinarySearchFound() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int result = BinarySearch.binarySearchRecursive(array, 4, 0, array.length - 1);
        assertEquals(3, result);
    }
    @org.junit.Test
    @Test
    public void testBinarySearchNotFound() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int result = BinarySearch.binarySearchRecursive(array, 8, 0, array.length - 1);
        assertEquals(-1, result);
    }
    @org.junit.Test
    @Test
    public void testEmptyArray() {
        int[] array = {};
        int result = BinarySearch.binarySearchRecursive(array, 4, 0, 0);
        assertEquals(-1, result);
    }
}
