package day30_CustomClassIntro;

public class Car {//this class is not for running....
    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public void setInfo(String carBrand,String carModel, String carColor,int carYear, double carPrice){
        brand=carBrand;
        model=carModel;
        color=carColor;
        year=carYear;
        price=carPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
    public void drive(){
        System.out.println("Driving "+brand+model);

    }

    public void start(){
        System.out.println(" "+brand+model+" has started");

    }


    }
