package com.derylspielman.algorithms.sorting;

/**
 *
 */
public class BubbleSort {

    public int[] sortArray(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("At index " + i + " of " + array.length);
            for (int j = 0; j < array.length - i - 1; j++) {

                System.out.println("  At index " + j + " of " + (array.length - i - 1));
                int right = array[j + 1];
                int left = array[j];

                System.out.println("    Comparing [" + left + "," + right + "] at indexes " + j + "," + (j + 1));
                if (left > right) {
                    System.out.println("    Swapping " + left + " and " + right);
                    array[j] = right;
                    array[j + 1] = left;
                }
            }
        }

        return array;
    }

    /**
     * Uses a variable to track whether a swap happened. Will stop sorting early if no swaps have happened.
     *
     * @param array
     * @return
     */
    public static int[] sortArrayOptimized(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
        return array;

    }
}
