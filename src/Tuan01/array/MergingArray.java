package Tuan01.array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MergingArray {
    public static int[] getRandomArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 9 + 1);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array1;
        int array1_length;
        int[] array2;
        int array2_length;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of array1: ");
        array1_length = scanner.nextInt();
        array1 = getRandomArray(array1_length);
        System.out.print("\narray1: ");
        for (int j : array1) {
            System.out.print(j + " ");
        }
        System.out.print("\nInput the length of array2: ");
        array2_length = scanner.nextInt();
        array2 = getRandomArray(array2_length);
        System.out.print("\narray2: ");
        for (int k : array2) {
            System.out.print(k + " ");
        }
        int[] array3 = new int[array1_length + array2_length];
        for (int l = 0; l < array1_length; l++) {
            array3[l] = array1[l];
        }
        for (int m = 0; m < array2_length; m++) {
            array3[m + array1_length] = array2[m];
        }
        System.out.print("\narray3: ");
        for (int result : array3) {
            System.out.print(result + " ");
        }
    }
}
