package Tuan01.array;

import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of array: ");
        size = scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i < size) {
            array[i] = (int) (Math.random() * 9 + 1);
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println("\nInput the number you want to delete: ");
        number = scanner.nextInt();
        for (int j = 0; j < size; j++) {
            if (number == array[j]) {
                for (int k = j; k < size - 1; k++) {
                    array[k] = array[k + 1];
                }
                array[size - 1] = 0;
            }
        }
        System.out.print("New array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
