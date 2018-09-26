package shapes;

public abstract class Square extends Quadrilateral{


public Square(double length) {
    super(length, length);
}
    public double getPerimeter() {
        return 4*this.length;
    }
public double getArea() {
    return this.length*this.length;
}
public void setLength(double length) {
    this.length = length;
    this.width = length;
}
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }
//    protected int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side= side;
//    }
//
//    public int getArea(){
//        return side*side;
//    }
//
//    public int getPerimeter() {
//        return 4 * side;
//    }
}
