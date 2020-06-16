public class TestPointAndMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(1, 2);
        System.out.println(point);

        point = new Point(3, 5);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(10, 12);
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(2, 4, 6, 8);
        System.out.println(moveablePoint);
        moveablePoint.setSpeed(1, 2);
        moveablePoint.setXY(2,1);
        System.out.println(moveablePoint);
    }
}
