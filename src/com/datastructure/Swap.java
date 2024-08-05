package com.datastructure;

import java.util.Arrays;

public class Swap {

    public static void swap(int[] arr, int arr1, int arr2) {
        if (arr1 < 0 || arr1 >= arr.length || arr2 < 0 || arr2 >= arr.length) {
            return;
        }

        int temp = arr[arr1];
        arr[arr1] = arr[arr2];
        arr[arr2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 10, 5, 8};
        swap(arr, 1, 2);

        System.out.println(Arrays.toString(arr));

    }
}