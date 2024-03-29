package day38_Inheritance.carTask;

public class Tesla extends Car {
    public Tesla( String model, String color, int year, double price, int miles) {
        super("Tesla", model, color, year, price, miles);
    }
    public void autoPilot(){
        System.out.println(brand+" "+model+" in autopilot mode");
    }
    @Override
    public void start() {
        System.out.println("Say \"Start\" to start "+brand+" "+model);
    }

}
