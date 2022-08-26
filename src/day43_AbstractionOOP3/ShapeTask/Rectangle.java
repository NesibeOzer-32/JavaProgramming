package day43_AbstractionOOP3.ShapeTask;

public class Rectangle extends Shape {

    public double width, length;

    @Override
    public double area() {
        return width*length;
    }
}
