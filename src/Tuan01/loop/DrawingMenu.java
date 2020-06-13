package Tuan01.loop;

public class DrawingMenu {
    public static void drawTheTriangle(int w) {
        int i = w;
        for (; i > 0; i--) {
            for (int j = 0; j < w; j++) {
                System.out.print("*");
            }
            System.out.println("");
            w--;
        }
    }

    public static void drawTheSquare(int w) {
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void drawTheRectangle(int w, int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int choice = -1;
        int width;
        int height;
        java.util.Scanner input = new java.util.Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter width:");
                    width = input.nextInt();
                    drawTheTriangle(width);
                    break;
                case 2:
                    System.out.println("Enter width:");
                    width = input.nextInt();
                    drawTheSquare(width);
                    break;
                case 3:
                    System.out.println("Enter width:");
                    width = input.nextInt();
                    System.out.println("Enter height:");
                    height = input.nextInt();
                    drawTheRectangle(width, height);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }

    }
}