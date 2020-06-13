package Tuan01.array;

import java.util.Scanner;

public class CountsTheNumberOfOccurrencesOfaString {
    public static void main(String[] args) {
        String check;
        String check2;
        int count = 0;
        String str = "yweugrriuwern87v23y3nvrucwerc82c3";
        System.out.println("Random string: " + str);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a characters: ");
        check = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            check2 = Character.toString(str.charAt(i));
            if (check.equals(check2)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
