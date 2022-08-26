package day43_AbstractionOOP3.ShapeTask;

public class Cube extends Shape implements Volume {

    public double side;

    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public double volume() {
        return 0;
    }
}
