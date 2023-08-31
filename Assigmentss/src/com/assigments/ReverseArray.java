package com.assigments;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int length = arr.length;
        
        int[] reversedArr = new int[length];
        
        for (int i = 0; i < length; i++) {
            reversedArr[i] = arr[length - 1 - i];
        }
        
        System.out.println(Arrays.toString(arr));
        
        System.out.println(Arrays.toString(reversedArr));
        
    }
}

