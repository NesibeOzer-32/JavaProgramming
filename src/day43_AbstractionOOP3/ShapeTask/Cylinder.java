package day43_AbstractionOOP3.ShapeTask;

public class Cylinder extends Shape implements Volume {

    public double radius;
    public double height;
    public static double pi=3.14;

    @Override
    public double area() {
        return pi*radius*radius*height;
    }

    @Override
    public double volume() {
        return 0;
    }
}
