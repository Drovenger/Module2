
public class PointTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(1.0f, 2.0f);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(1.0f,2.0f,3.0f);
        System.out.println(point3D);
    }
}
