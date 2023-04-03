package com.bubbleSortAlg;

public final class BubbleSort {
    public int[] execute(int[] array) {
        int arrLength = array.length;
        int temp;
        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < (arrLength - i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
