public class Cylinder extends Circle {
    public double height;

    public Cylinder() {
        this.height = 1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * getArea();
    }

    @Override
    public String toString() {
        return "A Cylinder with height: " + this.height + " and volume: " + getVolume() + ", which is a subclass of " + super.toString();
    }
}
