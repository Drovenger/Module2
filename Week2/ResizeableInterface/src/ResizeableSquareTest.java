public class ResizeableSquareTest {
    public static void main(String[] args){
        ResizeableSquare[] squares = new ResizeableSquare[3];
        squares[0] = new ResizeableSquare();
        squares[1] = new ResizeableSquare(2);
        squares[2] = new ResizeableSquare(4);

        for(ResizeableSquare resizeableSquare : squares){
            System.out.println(resizeableSquare.getArea());
            resizeableSquare.resize(5);
            System.out.println(resizeableSquare.getArea());
            System.out.println();
        }
    }
}
