package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius = scan.nextDouble();
        double perimeter = 2 * 3.14 * radius;
        double area = radius * radius * 3.14;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        scan.close();
    }
}
