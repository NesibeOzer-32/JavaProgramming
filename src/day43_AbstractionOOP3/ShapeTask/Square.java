package day43_AbstractionOOP3.ShapeTask;

public class Square extends Shape {

    public double side;

    @Override
    public double area() {
        return side*side;
    }
}
