import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter any string: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        inputString = inputString.toLowerCase();
        Queue queue = new LinkedList();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.add(inputString.charAt(i));
        }

        String reverseStringResult = "";

        while (!queue.isEmpty()) {
            reverseStringResult = reverseStringResult + queue.remove();
        }

        if (inputString.equals(reverseStringResult))
            System.out.println("The input String is a Palindrome");
        else
            System.out.println("The iput String is not a Palindrome");
    }
}