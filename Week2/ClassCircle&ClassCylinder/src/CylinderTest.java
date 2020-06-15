public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2);
        System.out.println(cylinder);

        cylinder = new Cylinder(3,2);
        System.out.println(cylinder);

        cylinder = new Cylinder(10.0,5.0,"blue");
        System.out.println(cylinder);
    }
}