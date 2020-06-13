package Tuan01.OOP;

class Rectangle {
    private Double width;
    private Double height;

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getArea() {
        return width * height;
    }

    public Double getPerimeter() {
        return (width + height) * 2;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.0, 4.0);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }

    public String display() {
        return "Rectangle{" + "width = " + width + ", height = " + height + "}";
    }
}
