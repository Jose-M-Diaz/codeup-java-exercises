package shapes;

public class Square extends Quadrilateral {
    private int side;

    public Square(int side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void setLength(int length) {
        setSide(length);
    }

    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    public int getSide() {
        return this.side;
    }

    public void setSide(int side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }
}
