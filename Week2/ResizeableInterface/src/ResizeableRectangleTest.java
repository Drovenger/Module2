public class ResizeableRectangleTest {
    public static void main(String[] args){
        ResizeableRectangle[] resizeableRectangles = new ResizeableRectangle[3];
        resizeableRectangles[0] = new ResizeableRectangle();
        resizeableRectangles[1] = new ResizeableRectangle(1,2);
        resizeableRectangles[2] = new ResizeableRectangle(3,4);

        for(ResizeableRectangle resizeableRectangle : resizeableRectangles){
            System.out.println(resizeableRectangle.getArea());
            resizeableRectangle.resize(50);
            System.out.println(resizeableRectangle.getArea());
            System.out.println();
        }
    }
}