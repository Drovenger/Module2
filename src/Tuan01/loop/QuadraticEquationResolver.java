package Tuan01.loop;

import java.util.Scanner;

public class QuadraticEquationResolver {
    public static void main(String[] args) {
        System.out.println("Quadratic Equation Resolver");
        System.out.println("Given a equation as 'a*x^2+b*x+c=0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("Equation pass with x = " + answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
