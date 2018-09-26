package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width){
        super(length, width);
    }
    public double getPerimeter(){
        return 2 * length + 2 * width;

    }
    public double getArea(){
        return length*width;

    }
    public void setLength(double length) {
        this.length = length;
    }
//    public void setLength(int length) {
//
//    }

    public void setWidth(double width) {
        this.width = width;
    }
//    public void setWidth(int width) {
//
//    }
//    protected int length;
//    protected int width;
//
//
//    public Rectangle(int length, int width){
//    this.length=length;
//    this.width=width;
//    }
//
//    public int getArea(){
//        return length*width;
//    }
//
//    public int getPerimeter() {
//        return 2 * length + 2 * width;
//    }





}
