package day30_CustomClassIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setInfo("BMW","X5","BLACK",2010,4000);
        System.out.println(car1);

        Car car2= new Car();
        car2.setInfo("Toyota","Camry","red",2019,7000);
        System.out.println(car2);

        Car car3=new Car();
        car3.setInfo("Audi","Q7","White",1999,6000);
        System.out.println(car3);


        ArrayList<Car> carList= new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));
        System.out.println("carList = " + carList);

        for (Car each :carList) {
            System.out.println(each.brand+""+each.price);
        }
        System.out.println("...................................................");

        /*
        recall;

         */
        carList.removeIf(p-> p.brand.equals("BMW")&& p.year>=2005&&p.year<=2008);
        carList.removeIf(p-> p.brand.equals("Toyota")&& p.year>=1995&&p.year<=1997);

    }
}
