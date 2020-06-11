public class QuadraticEquation {
    private Double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }

    public Double getC() {
        return c;
    }

    public Double getDiscriminant() {
        return b * 2 - 4 * a * c;
    }

    public Double getRoot1() {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    public Double getRoot2() {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    public String display() {
        return "Return: " + a + "x^2 + " + b + "x + " + c + " = 0";
    }
}
