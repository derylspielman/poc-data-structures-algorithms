package com.derylspielman.algorithms.sorting;

/**
 *
 */
public class SelectionSort {

    public static int[] sortArray(int[] array) {

        // 10, 18, 6, 2, 4, 16, 8, 14, 12
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("At index " + i + " of " + (array.length - 1));

            int index = i;

            for (int j = i + 1; j < array.length; j++) {
                final int left = array[j];
                final int right = array[index];
                System.out.println("  At index " + j + " of " + array.length);

                System.out.println("    Comparing [" + left + "," + right + "] at indexes " + j + "," + index);
                if (left < right) {
                    System.out.println("    New index is " + j);
                    index = j;
                }
            }
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

}
