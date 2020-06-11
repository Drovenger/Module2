import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();
        System.out.print("Input c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        System.out.println("a is " + quadraticEquation.getA());
        System.out.println("b is " + quadraticEquation.getB());
        System.out.println("c is " + quadraticEquation.getC());
        System.out.println(quadraticEquation.display());
        System.out.println("Delta is " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println(quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
