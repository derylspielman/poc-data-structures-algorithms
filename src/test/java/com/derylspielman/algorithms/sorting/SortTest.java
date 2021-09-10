package com.derylspielman.algorithms.sorting;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author dev
 */
public abstract class SortTest {

    final int[] UNORDERED_ARRAY = new int[]{10, 18, 6, 2, 4, 16, 8, 14, 12};

    abstract int[] sortArray(int[] toSort);
   
    @Test
    public void sortArray_Unordered_SortsInAscendingOrder() {
        int[] toSort = UNORDERED_ARRAY;
        int[] expected = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18};

        int[] actual = sortArray(toSort);
        
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
    
}
