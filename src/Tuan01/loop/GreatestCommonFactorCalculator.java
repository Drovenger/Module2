package Tuan01.loop;

import java.util.Scanner;

public class GreatestCommonFactorCalculator {
    public static int isGreatestCommonFactor(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        a = scanner.nextInt();
        System.out.println("Enter b:");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor!");
        } else {
            a = isGreatestCommonFactor(a, b);
            System.out.println("Greatest common factor: " + a);
        }
    }
}
