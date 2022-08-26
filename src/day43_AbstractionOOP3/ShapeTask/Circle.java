package day43_AbstractionOOP3.ShapeTask;

public class Circle extends Shape {

    public double radius;
    public static double pi=3.14;

    public double area(){
        return radius*radius*pi;

    }
}
