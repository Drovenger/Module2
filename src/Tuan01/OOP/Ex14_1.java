package Tuan01.OOP;

import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2.0, 4.0);

        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        Rectangle rectangle1 = new Rectangle(width, height);

        System.out.println("Your Rectangle \n"+ rectangle1.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle1.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle1.getArea());
    }
}
