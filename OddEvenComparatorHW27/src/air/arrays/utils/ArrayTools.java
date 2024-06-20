package air.arrays.utils;

import java.util.Arrays;

public class ArrayTools {

    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("===========================");
    }

    public static Integer[] oddEvenSort(Integer[] arr) {
        Arrays.sort(arr, (a, b) -> a % 2 - b % 2);
        return arr;
    }

    public static Integer[] oddEvenSortPlus(Integer[] arr) {
        Arrays.sort(arr, new OddEvenComparator());
        return arr;
    }
}
