package day38_Inheritance.carTask;

public class Toyota extends Car {
    public Toyota(String model, String color, int year, double price, int miles) {
        super("Toyota", model, color, year, price, miles);
    }

    public void reliable(){
        System.out.println(brand +" " + model + "is reliable" );
    }
}
/*
1. Toyota:
					extra methods:
							reliable()
 */