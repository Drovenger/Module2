package Tuan01.loop;

import java.util.Scanner;

public class IsPrime3 {
    public static boolean isCheckPrime(int a) {
        int i = 2;
        boolean check = true;
        if (a < 2) {
            check = false;
        }
        while (i <= Math.sqrt(a)) {
            if (a % i == 0) {
                check = false;
                break;
            }
            i++;
        }
        return check;
    }

    public static void main(String[] args) {
        int numbers = 100;
        int count = 0;
        int n = 2;
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("How many prime numbers you want to print? ");
        //numbers = scanner.nextInt();
        while (n < numbers) {
            boolean check;
            check = isCheckPrime(n);
            if (check) {
                //System.out.println(count + 1 + "      " + n);
                System.out.printf("%-6d%s\n", count + 1, n);
                count++;
            }
            n++;
        }
    }
}
