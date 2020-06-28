import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String original = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == '(') {
                stack.push(i);
            } else if (original.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }

        if (stack.empty()) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}