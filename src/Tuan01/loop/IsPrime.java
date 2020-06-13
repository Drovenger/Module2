package Tuan01.loop;

public class IsPrime {
    public static boolean isCheckPrime(int a) {
        int i = 2;
        boolean check = true;
        if (a < 2) {
            check = false;
        }
        while (i < Math.sqrt(a)) {
            if (a % i == 0) {
                check = false;
                break;
            }
            i++;
        }
        return check;
    }

    public static void main(String[] args) {
        boolean check;
        int number;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();
        check = isCheckPrime(number);
        if (check) {
            System.out.println(number + " is a prime.");
        } else {
            System.out.println(number + " is not a prime.");
        }
    }
}