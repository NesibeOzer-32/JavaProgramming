package day31_Constructor;

public class Rectangle {
    public  double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }

    public double calcArea(){
        return length* width;
    }

    public double calcPerimeter(){
        return  2*(length+width);
    }
}
