public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle("blue", false, 4, 3,1.1);
        System.out.println(triangle);
    }
}