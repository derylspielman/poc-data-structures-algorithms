package com.derylspielman.algorithms.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class BubbleSortTest extends SortTest {

    @Test
    public void sortArrayOptimized_UnorderedArray_SortsInAscendingOrder() {
        int[] toSort = new int[]{10, 18, 6, 2, 4, 16, 8, 14, 12};
        int[] expected = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18};

        int[] actual = new BubbleSort().sortArray(toSort);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sortArrayOptimized_OrderedArray_SortsInAscendingOrder() {
        int[] toSort = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18};
        int[] expected = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18};

        int[] actual = new BubbleSort().sortArrayOptimized(toSort);
        assertArrayEquals(expected, actual);
    }

    @Override
    int[] sortArray(int[] toSort) {
        return new BubbleSort().sortArray(toSort);
    }

}
