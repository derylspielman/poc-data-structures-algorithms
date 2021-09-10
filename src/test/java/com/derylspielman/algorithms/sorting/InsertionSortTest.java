package com.derylspielman.algorithms.sorting;

/**
 *
 * @author dev
 */
public class InsertionSortTest extends SortTest {

    @Override
    int[] sortArray(int[] toSort) {
        return new InsertionSort().sortArray(toSort);
    }

}
