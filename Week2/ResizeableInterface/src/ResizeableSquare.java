public class ResizeableSquare extends Square implements Resizeable{

    ResizeableSquare(){}

    ResizeableSquare(double side){super(side);}

    @Override
    public double resize(double percent) {
        if(percent <= 100 && percent >= 1){
            this.setSide(getSide() + (getSide()*(percent/100)));
        }
        return this.getSide();
    }
}