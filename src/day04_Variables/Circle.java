package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        double radius = 4.3;
        double PI = 3.14;
        double diameter = radius * 2;
        double area = PI * radius * radius;
        double perimeter = diameter * PI;
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println("diameter = " + diameter);
        System.out.println("perimeter = " + perimeter);
        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
    }
}
