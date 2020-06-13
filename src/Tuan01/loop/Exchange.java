package Tuan01.loop;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value of USD:");
        int usd = scanner.nextInt();
        int vnd;
        final int rate = 23000;
        vnd = usd * rate;
        System.out.println("Exchange to VND: " + vnd + " VND");
    }
}
