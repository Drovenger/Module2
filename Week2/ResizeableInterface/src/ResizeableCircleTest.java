public class ResizeableCircleTest {
    public static void main(String[] args){
        Circle[] circles = new Circle[3];
        circles[0] = new ResizeableCircle();
        circles[1] = new ResizeableCircle(2);
        circles[2] = new ResizeableCircle(3);

        for(Circle circle :  circles){
            System.out.println(circle.getArea());
            if(circle instanceof ResizeableCircle){
                ((ResizeableCircle) circle).resize(2.5);
                System.out.println(circle.getArea());
            }
            System.out.println();
        }
    }
}