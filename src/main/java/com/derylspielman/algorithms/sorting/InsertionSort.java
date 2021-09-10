package com.derylspielman.algorithms.sorting;

import java.util.Arrays;

/**
 * Algorithm To sort an array of size n in ascending order:
 * <ol>
 * <li>Iterate from arr[1] to arr[n] over the array. </li>
 * <li>Compare the current element (key) to its predecessor.</li>
 * <li>If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one
 * position up to make space for the swapped element.</li>
 * </ol>
 */
public class InsertionSort implements Sort {

    @Override
    public int[] sortArray(int[] array) {

        if (array.length <= 1) {
            return array;
        }
        
        System.out.println();
        System.out.println(Arrays.toString(array));
        
        // 10, 18, 6, 2, 4, 16, 8, 14, 12
        for (int currentIndex = 1; currentIndex < array.length; currentIndex++) {
            //System.out.println("At current index " + currentIndex);

            int currentItem = array[currentIndex];
            int leftIndex = currentIndex - 1;
            //System.out.println("  Current item: " + currentItem);
            //System.out.println("  Left index: " + leftIndex);
            //System.out.println("  Comparing: " + array[leftIndex] + " > " + currentItem);
            while (leftIndex >= 0 && array[leftIndex] > currentItem) {
                System.out.println("  " + array[leftIndex] + " > " + currentItem);
                //System.out.println("    Replacing: " + array[leftIndex + 1] + " with " + array[leftIndex]);
                //System.out.println(Arrays.toString(array));
                array[leftIndex + 1] = array[leftIndex];
                leftIndex = leftIndex - 1;
                System.out.println(Arrays.toString(array));
              //  System.out.println("    Left index: " + leftIndex);
            }
            //System.out.println("Replacing: " + array[leftIndex + 1] + " with " + currentItem);
            array[leftIndex + 1] = currentItem;
            System.out.println(Arrays.toString(array));
        }
        return array;
    }

}
