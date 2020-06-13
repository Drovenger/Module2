package Tuan01.array;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang:");
        size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9 + 1);
            System.out.print(array[i]);
        }
        System.out.println("");
        for (int i = 0; i < array.length/2; i++) {
            int temp = 0;
            temp = array[i];
            array[i] = array[array.length - 1 -i];
            array[array.length - 1 - i] = temp;
        }

        for (int k:array) {
            System.out.print(k);
        }
    }
}
