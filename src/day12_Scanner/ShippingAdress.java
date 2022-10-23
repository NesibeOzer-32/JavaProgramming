package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your fullname: ");
        String fullName = input.nextLine();
        System.out.println("Enter your building number:");
        int BuildingNumber = input.nextInt();
        input.nextLine();
        System.out.println("Enter your street name: ");
        String StreetName = input.nextLine();
        System.out.println("Enter your city name: ");
        String CityName = input.nextLine();
        System.out.println("Enter your state name: ");
        String StateName = input.nextLine();
        System.out.println("Enter your zipcode: ");
        String ZipCode = input.nextLine();
        System.out.println("fullName = " + fullName);
        System.out.println("BuildingNumber = " + BuildingNumber);
        System.out.println("StreetName = " + StreetName);
        System.out.println("CityName = " + CityName);
        System.out.println("StateName = " + StateName);
        System.out.println("ZipCode = " + ZipCode);

    }
}
