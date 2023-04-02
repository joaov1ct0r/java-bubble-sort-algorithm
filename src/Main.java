package com.bubbleSort;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int[] array = new int[] {78, 45, 23, 67, 65, 11, 90, 100, 1493};

        int[] result = bubbleSort.execute(array);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}