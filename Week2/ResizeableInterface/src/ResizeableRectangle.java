public class ResizeableRectangle extends Rectangle implements Resizeable{

    ResizeableRectangle(){}

    ResizeableRectangle(double width, double length){
        super(width, length);
    }

    @Override
    public double resize(double percent) {
        if(percent <= 100 && percent >=1){
            this.setWidth(getWidth() + (getWidth()*(percent/100)));
            this.setLength(getLength()+(getLength()*(percent/100)));
        }
        return this.getLength();
    }
}