package Tuan01.array;

import java.util.Scanner;

public class InputElementToArray {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int x;
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the element you want to input: ");
        x = scanner.nextInt();
        System.out.print("\nWhere you want to input? [0 to " + array.length + "]: ");
        index = scanner.nextInt();
        if (index < 0 || index > (array.length - 1)) {
            System.out.print("\nCan't input in this place!");
        } else {
            System.out.print("\nNew aray: ");
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    for (int j = array.length - 1; j > 0; j--) {
                        array[j] = array[j - 1];
                    }
                    array[index] = x;
                }
                System.out.print(array[i] + " ");
            }
        }
    }
}
