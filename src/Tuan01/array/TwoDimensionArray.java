package Tuan01.array;

import java.util.Scanner;

public class TwoDimensionArray {
    public static int getLargesElement(int[][] array) {
        int max = array[0][0];
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    public static int getSmallestElement(int[][] array) {
        int min = array[0][0];
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (min > anInt) {
                    min = anInt;
                }
            }
        }
        return min;
    }

    public static void getPosition(int[][] array, int value) {
        System.out.print("In position: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (value == array[i][j]) {
                    System.out.print("[" + i + "][" + j + "] ");
                }
            }
        }
    }

    public static int getSumLine(int[][] array, int line) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (line == i) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static int getSumColumn(int[][] array, int column) {
        int sum = 0;
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                if (column == j) {
                    sum += ints[j];
                }
            }
        }
        return sum;
    }

    public static int getSumOfMainDiagonal(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int column;
        int value;
        int line;
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInput number columns for the 2D array: ");
        column = scanner.nextInt();
        System.out.print("\nInput number of lines for the 2D array: ");
        line = scanner.nextInt();
        int[][] tdarray = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                tdarray[i][j] = (int) (Math.random() * 100);
                System.out.printf("%-4d", tdarray[i][j]);
            }
            System.out.print("\n");
        }
        while (true) {
            System.out.println("\n----------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Largest element in the array");
            System.out.println("2. Smallest element in array");
            System.out.println("3. Sum of the numbers in a given column");
            System.out.println("4. Sum of the numbers in a given line");
            System.out.println("5. Sum of the numbers in the main diagonal of the square matrix");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Largest Element in 2d array is: " + getLargesElement(tdarray));
                    getPosition(tdarray, getLargesElement(tdarray));
                    break;
                case 2:
                    System.out.println("\nSmallest Element in 2d array is: " + getSmallestElement(tdarray));
                    getPosition(tdarray, getSmallestElement(tdarray));
                    break;
                case 3:
                    System.out.println("Input the column you want to sum (0 to " + column + "): ");
                    value = scanner.nextInt();
                    System.out.println("Sum of the numbers in column " + value + " is: " + getSumColumn(tdarray, value));
                    break;
                case 4:
                    System.out.println("Input the line you want to sum (0 to " + line + "): ");
                    value = scanner.nextInt();
                    System.out.println("Sum of the numbers in line " + value + " is: " + getSumLine(tdarray, value));
                    break;
                case 5:
                    if (column != line) {
                        System.out.println("This array is not a square matrix!");
                    } else {
                        System.out.println("Sum of the numbers in the main diagonal of the square matrix is: " + getSumOfMainDiagonal(tdarray));
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

