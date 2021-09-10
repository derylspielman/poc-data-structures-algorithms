package com.derylspielman.algorithms.sorting;

import java.util.Arrays;

public class MergeSort implements Sort {

    @Override
    public int[] sortArray(int[] array) {

       mergeSort(array, array.length);
       return array;
    }

    private void mergeSort(int array[], int length) {

        if (length < 2) {
            return;
        }

        int middleIndex = length / 2;

        int[] left = Arrays.copyOfRange(array, 0, middleIndex);
        int[] right = Arrays.copyOfRange(array, middleIndex, length);

        mergeSort(left, middleIndex);
        mergeSort(right, length - middleIndex);
        merge(array, array, right, middleIndex, length - middleIndex);

    }

    private void merge(int[] originalArray, int[] leftArray, int[] rightArray, int leftLength, int rightLength) {
        
    }

}
