import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to convert to binary: ");
        int numeric = scanner.nextInt();
        int num = numeric;

        String baseBinary = "";
        String binary = "";

        while (numeric > 0) {
            baseBinary += numeric % 2;
            numeric = numeric / 2;
        }

        for (int i = baseBinary.length() - 1; i >= 0; i--) {
            char item = baseBinary.charAt(i);
            binary += item;
        }
        System.out.println(num + " Decimal = " + binary + " Binary");
    }
}