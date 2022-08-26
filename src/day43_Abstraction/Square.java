package day43_Abstraction;

public class Square extends Shape {

    public double side;

    @Override
    public double area() {
        return side*side;
    }
}
