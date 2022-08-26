package day43_Abstraction;

public class Rectangle extends Shape {

    public double width, length;

    @Override
    public double area() {
        return width*length;
    }
}
