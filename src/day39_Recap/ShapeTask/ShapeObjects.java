package day39_Recap.ShapeTask;

import day03_EscapeSecuences.Triangle;

public class ShapeObjects {
    public static void main(String[] args) {
        System.out.println("........................square...............................");

        Square square= new Square(10);
        //Square square2= new Square(-10); set ile tanımladık. negatif deger olamaz
        System.out.println("square = " + square);

        //square.side=20; we cant assign, only with set
        square.setSide(4);
        System.out.println("square = " + square);

        System.out.println(".......................circle.............................");

        Circle circle=new Circle(5);
        System.out.println("circle = " + circle);

        circle.setRadius(7.5);
        System.out.println(circle.getRadius());
        System.out.println("circle = " + circle);


        System.out.println(".........................Rectangle...........................");

        Rectangle rectangle=new Rectangle(4,9);
        //Rectangle rectangle=new Rectangle(-4,9);invalid

        System.out.println(rectangle.getName());

        System.out.println("rectangle = " + rectangle);

        rectangle.setLength(10);

        System.out.println(rectangle.getLength());

        System.out.println("rectangle = " + rectangle);



    }
}
