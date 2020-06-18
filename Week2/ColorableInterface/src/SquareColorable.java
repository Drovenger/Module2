public class SquareColorable {
    public static void main(String[] args) {
        Shape[] shape = new Shape[10];
        for (int i = 0; i < shape.length; i++) {
            shape[i] = getRandomShape();
        }
        Shape.printShape(shape);
        for (Shape x : shape) {
            if (x instanceof Colorable) {
                ((Colorable) x).howToColor();
            }
        }
    }

    static Shape getRandomShape() {
        int random = (int) (Math.round(Math.random() * 2));
        switch (random) {
            case 0:
                return new Square((double) (Math.round(Math.random() * 100)));
            case 1:
                return new Rectangle((double) (Math.round(Math.random() * 100)), (double) (Math.round(Math.random() * 100)));
            default:
                return new Circle((double) (Math.round(Math.random() * 100)));
        }
    }
}