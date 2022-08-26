package day46_PolymorphismOOP4;

import day43_AbstractionOOP3.ShapeTask.*;

public class PolymorphismIntro {
    public static void main(String[] args) {

        Shape shape1= new Circle();
        //shape1.radius=10;

        System.out.println(shape1.area());

        Shape shape2= new Rectangle();
        //shape2.length=20;
        //shape2.width=40;
        System.out.println(shape2.area());

        Shape shape3= new Square();

        System.out.println(shape3.area());

        Circle circle1= new Circle();
        circle1.radius=38;
        System.out.println(circle1.area());

        Rectangle rectangle1=new Rectangle();
        rectangle1.length=10;
        rectangle1.width=20;
        System.out.println(rectangle1.area());

        Square square1=new Square();
        square1.side=50;
        System.out.println(square1.area());

    Shape[] shapes={circle1,rectangle1,square1,shape1,shape2,shape3};

        Volume obj1= new Cube();
        System.out.println(obj1.volume());
        Volume obj2= new Cylinder();
        System.out.println(obj2.volume());

    }

}
