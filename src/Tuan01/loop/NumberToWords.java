package Tuan01.loop;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number (0-999):");
        int number = scanner.nextInt();
        int onesDigit;
        int tensDigit;
        int hundredsDigit;
        String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        //tao mang dem so nho hon 20
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        //tao mang nhung so chia het cho 10
        String[] hundreds = {"one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
        //tao mang nhuwng so chia het cho 100
        hundredsDigit = number / 100 - 1;//lay vi tri so hang tram trong mang
        tensDigit = (number % 100) / 10;//lấy vị trí số hàng chục ở trong mảng
        onesDigit = number % 10;//lấy vị trí hàng đơn vị (lấy vị trí những số nhỏ hơn 10
        if (number % 100 < 20) {//lấy vị trí những số lớn hơn 10 và nhỏ hơn 20 vd: 112,219
            onesDigit = number % 20;
        }
        if (number < 20) {
            String result = ones[number];
            System.out.println("Result: " + result);
        } else if (number >= 20 && number < 100) {
            if (number % 10 == 0) {
                System.out.println("Result: " + tens[tensDigit]);
            } else {
                System.out.println("Result: " + tens[tensDigit] + " " + ones[onesDigit]);
            }
        } else if (number % 100 == 0) {
            System.out.println("Result: " + hundreds[hundredsDigit]);
        } else if (number > 100 && number < 1000) {
            if (number % 10 == 0) {
                System.out.println("Result: " + hundreds[hundredsDigit] + " " + tens[tensDigit]);
            } else {
                System.out.println("Result: " + hundreds[hundredsDigit] + " " + tens[tensDigit] + " " + ones[onesDigit]);
            }
        } else {
            System.out.println("Out of ability!");
        }
    }
}
